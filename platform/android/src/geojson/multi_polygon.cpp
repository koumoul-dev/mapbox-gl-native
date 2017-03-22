#include "multi_polygon.hpp"

namespace mbgl {
namespace android {
namespace geojson {

mapbox::geojson::multi_polygon MultiPolygon::convert(jni::JNIEnv &env, jni::Object<MultiPolygon> jMultiPolygon) {
    (void) env;
    (void) jMultiPolygon;
    // TODO
    throw std::runtime_error("not implemented");
}

void MultiPolygon::registerNative(jni::JNIEnv &env) {
    // Lookup the class
    javaClass = *jni::Class<MultiPolygon>::Find(env).NewGlobalRef(env).release();
}

jni::Class<MultiPolygon> MultiPolygon::javaClass;

} // namespace geojson
} // namespace android
} // namespace mbgl