#include "position.hpp"

namespace mbgl {
namespace android {
namespace geojson {

mapbox::geojson::point Position::convert(jni::JNIEnv &env, jni::Object<Position> jPosition) {
    static auto method = Position::javaClass.GetMethod<jni::Array<jdouble> ()>(env, "getCoordinates");
    // Array with 0: longitude, 1: latitude (and optionally 2: altitude)
    auto coordinates = jPosition.Call(env, method);
    mapbox::geojson::point point (coordinates.Get(env, 0), coordinates.Get(env, 1));
    jni::DeleteLocalRef(env, coordinates);
    return point;
}

void Position::registerNative(jni::JNIEnv &env) {
    // Lookup the class
    javaClass = *jni::Class<Position>::Find(env).NewGlobalRef(env).release();
}

jni::Class<Position> Position::javaClass;

} // namespace geojson
} // namespace android
} // namespace mbgl