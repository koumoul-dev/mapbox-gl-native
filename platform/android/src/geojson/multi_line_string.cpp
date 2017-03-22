#include "multi_line_string.hpp"

namespace mbgl {
namespace android {
namespace geojson {

mapbox::geojson::multi_line_string MultiLineString::convert(jni::JNIEnv &env, jni::Object<MultiLineString> jMultiLineString) {
    (void) env;
    (void) jMultiLineString;
    // TODO
    throw std::runtime_error("not implemented");
}

void MultiLineString::registerNative(jni::JNIEnv &env) {
    // Lookup the class
    javaClass = *jni::Class<MultiLineString>::Find(env).NewGlobalRef(env).release();
}

jni::Class<MultiLineString> MultiLineString::javaClass;

} // namespace geojson
} // namespace android
} // namespace mbgl