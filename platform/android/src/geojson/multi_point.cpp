#include "multi_point.hpp"

namespace mbgl {
namespace android {
namespace geojson {

mapbox::geojson::multi_point MultiPoint::convert(jni::JNIEnv &env, jni::Object<MultiPoint> jMultiPoint) {
    (void) env;
    (void) jMultiPoint;
    // TODO
    throw std::runtime_error("not implemented");
}

void MultiPoint::registerNative(jni::JNIEnv &env) {
    // Lookup the class
    javaClass = *jni::Class<MultiPoint>::Find(env).NewGlobalRef(env).release();
}

jni::Class<MultiPoint> MultiPoint::javaClass;

} // namespace geojson
} // namespace android
} // namespace mbgl