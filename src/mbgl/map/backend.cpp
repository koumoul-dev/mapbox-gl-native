#include <mbgl/map/backend.hpp>
#include <mbgl/map/backend_scope.hpp>
#include <mbgl/gl/context.hpp>

#include <cassert>

namespace mbgl {

Backend::Backend() = default;

Backend::~Backend() = default;

gl::Context& Backend::getContext() {
    std::call_once(initialized, [this] {
        assert(BackendScope::exists());
        context = std::make_unique<gl::Context>();
        using namespace std::placeholders;
        context->initializeExtensions(std::bind(&Backend::initializeExtension, this, _1));
        context->enableDebugging();
    });
    return *context;
}

PremultipliedImage Backend::readFramebuffer(const Size& size) const {
    assert(context);
    return context->readFramebuffer<PremultipliedImage>(size);
}

void Backend::assumeFramebufferBinding(const gl::FramebufferID fbo) {
    getContext().bindFramebuffer.setCurrentValue(fbo);
    if (fbo != ImplicitFramebufferBinding) {
        assert(gl::value::BindFramebuffer::Get() == getContext().bindFramebuffer.getCurrentValue());
    }
}
void Backend::assumeViewportSize(const Size& size) {
    getContext().viewport.setCurrentValue({ 0, 0, size });
    assert(gl::value::Viewport::Get() == getContext().viewport.getCurrentValue());
}

bool Backend::implicitFramebufferBound() {
    return getContext().bindFramebuffer.getCurrentValue() == ImplicitFramebufferBinding;
}

void Backend::setFramebufferBinding(const gl::FramebufferID fbo) {
    getContext().bindFramebuffer = fbo;
    if (fbo != ImplicitFramebufferBinding) {
        assert(gl::value::BindFramebuffer::Get() == getContext().bindFramebuffer.getCurrentValue());
    }
}

void Backend::setViewportSize(const Size& size) {
    getContext().viewport = { 0, 0, size };
    assert(gl::value::Viewport::Get() == getContext().viewport.getCurrentValue());
}

} // namespace mbgl
