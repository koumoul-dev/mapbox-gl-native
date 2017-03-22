#include "line_string.hpp"

namespace mbgl {
namespace android {
namespace geojson {

mapbox::geojson::line_string LineString::convert(jni::JNIEnv &env, jni::Object<LineString> jLineString) {
    (void) env;
    (void) jLineString;
    // TODO
    throw std::runtime_error("not implemented");
}

void LineString::registerNative(jni::JNIEnv &env) {
    // Lookup the class
    javaClass = *jni::Class<LineString>::Find(env).NewGlobalRef(env).release();
}

jni::Class<LineString> LineString::javaClass;

} // namespace geojson
} // namespace android
} // namespace mbgl