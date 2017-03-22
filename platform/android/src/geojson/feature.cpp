#include "feature.hpp"

#include "geometry.hpp"

namespace mbgl {
namespace android {
namespace geojson {

mbgl::Feature Feature::convert(jni::JNIEnv& env, jni::Object<Feature> jFeature) {
    auto geometry = getGeometry(env, jFeature);
    //TODO: properties + id
    auto feature = mbgl::Feature { Geometry::convert(env, geometry) } ;
    jni::DeleteLocalRef(env, geometry);
    return feature;
}

jni::Object<Geometry> Feature::getGeometry(jni::JNIEnv& env, jni::Object<Feature> jFeature) {
    static auto method = Feature::javaClass.GetMethod<jni::Object<Geometry> ()>(env, "getGeometry");
    return jFeature.Call(env, method);
}

jni::Object<Feature> Feature::fromGeometry(jni::JNIEnv& env, jni::Object<Geometry> geometry, jni::Object<JsonObject> properties, jni::String id) {
    static auto method = Feature::javaClass.GetStaticMethod<jni::Object<Feature> (jni::Object<Geometry>, jni::Object<JsonObject>, jni::String)>(env, "fromGeometry");
    return Feature::javaClass.Call(env, method, geometry, properties, id);
}

void Feature::registerNative(jni::JNIEnv& env) {
    // Lookup the class
    Feature::javaClass = *jni::Class<Feature>::Find(env).NewGlobalRef(env).release();
}

jni::Class<Feature> Feature::javaClass;

} // namespace geojson
} // namespace android
} // namespace mbgl