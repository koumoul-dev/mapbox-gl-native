// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.

#pragma once

#include "layer.hpp"
#include <mbgl/style/layers/raster_layer.hpp>
#include <jni/jni.hpp>

namespace mbgl {
namespace android {

class RasterLayer : public Layer {
public:

    static constexpr auto Name() { return "com/mapbox/mapboxsdk/style/layers/RasterLayer"; };

    static jni::Class<RasterLayer> javaClass;

    static void registerNative(jni::JNIEnv&);

    RasterLayer(jni::JNIEnv&, jni::String, jni::String);

    RasterLayer(mbgl::Map&, mbgl::style::RasterLayer&);

    RasterLayer(mbgl::Map&, std::unique_ptr<mbgl::style::RasterLayer>);

    ~RasterLayer();

    // Property getters
    jni::Object<jni::ObjectTag> getRasterOpacity(jni::JNIEnv&);


    jni::Array<jni::jlong> getRasterOpacityTransition(jni::JNIEnv&);

    void setRasterOpacityTransition(jni::JNIEnv&, jlong duration, jlong delay);
    jni::Object<jni::ObjectTag> getRasterHueRotate(jni::JNIEnv&);


    jni::Array<jni::jlong> getRasterHueRotateTransition(jni::JNIEnv&);

    void setRasterHueRotateTransition(jni::JNIEnv&, jlong duration, jlong delay);
    jni::Object<jni::ObjectTag> getRasterBrightnessMin(jni::JNIEnv&);


    jni::Array<jni::jlong> getRasterBrightnessMinTransition(jni::JNIEnv&);

    void setRasterBrightnessMinTransition(jni::JNIEnv&, jlong duration, jlong delay);
    jni::Object<jni::ObjectTag> getRasterBrightnessMax(jni::JNIEnv&);


    jni::Array<jni::jlong> getRasterBrightnessMaxTransition(jni::JNIEnv&);

    void setRasterBrightnessMaxTransition(jni::JNIEnv&, jlong duration, jlong delay);
    jni::Object<jni::ObjectTag> getRasterSaturation(jni::JNIEnv&);


    jni::Array<jni::jlong> getRasterSaturationTransition(jni::JNIEnv&);

    void setRasterSaturationTransition(jni::JNIEnv&, jlong duration, jlong delay);
    jni::Object<jni::ObjectTag> getRasterContrast(jni::JNIEnv&);


    jni::Array<jni::jlong> getRasterContrastTransition(jni::JNIEnv&);

    void setRasterContrastTransition(jni::JNIEnv&, jlong duration, jlong delay);
    jni::Object<jni::ObjectTag> getRasterFadeDuration(jni::JNIEnv&);


    jni::Array<jni::jlong> getRasterFadeDurationTransition(jni::JNIEnv&);

    void setRasterFadeDurationTransition(jni::JNIEnv&, jlong duration, jlong delay);
    jni::jobject* createJavaPeer(jni::JNIEnv&);

}; // class RasterLayer

} // namespace android
} // namespace mbgl
