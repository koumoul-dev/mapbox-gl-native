#include "polygon.hpp"

namespace mbgl {
namespace android {
namespace geojson {

mapbox::geojson::polygon Polygon::convert(jni::JNIEnv &env, jni::Object<Polygon> jPolygon) {
    (void) env;
    (void) jPolygon;
    // TODO
    throw std::runtime_error("not implemented");
}

void Polygon::registerNative(jni::JNIEnv &env) {
    // Lookup the class
    javaClass = *jni::Class<Polygon>::Find(env).NewGlobalRef(env).release();
}

jni::Class<Polygon> Polygon::javaClass;

} // namespace geojson
} // namespace android
} // namespace mbgl