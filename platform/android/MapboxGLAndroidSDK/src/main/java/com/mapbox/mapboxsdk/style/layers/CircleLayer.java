// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.

package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;

import static com.mapbox.mapboxsdk.utils.ColorUtils.rgbaToColor;

import com.mapbox.mapboxsdk.style.TransitionOptions;

/**
 * A filled circle.
 *
 * @see <a href="https://www.mapbox.com/mapbox-gl-style-spec/#layers-circle">The online documentation</a>
 */
@UiThread
public class CircleLayer extends Layer {

  /**
   * Creates a CircleLayer.
   *
   * @param nativePtr pointer used by core
   */
  public CircleLayer(long nativePtr) {
    super(nativePtr);
  }

  /**
   * Creates a CircleLayer.
   *
   * @param layerId  the id of the layer
   * @param sourceId the id of the source
   */
  public CircleLayer(String layerId, String sourceId) {
    initialize(layerId, sourceId);
  }

  protected native void initialize(String layerId, String sourceId);

  /**
   * Set the source layer.
   *
   * @param sourceLayer the source layer to set
   */
  public void setSourceLayer(String sourceLayer) {
    nativeSetSourceLayer(sourceLayer);
  }

  /**
   * Set the source Layer.
   *
   * @param sourceLayer the source layer to set
   * @return This
   */
  public CircleLayer withSourceLayer(String sourceLayer) {
    setSourceLayer(sourceLayer);
    return this;
  }

  /**
   * Set a single filter.
   *
   * @param filter the filter to set
   */
  public void setFilter(Filter.Statement filter) {
    nativeSetFilter(filter.toArray());
  }

  /**
   * Set a single filter.
   *
   * @param filter the filter to set
   * @return This
   */
  public CircleLayer withFilter(Filter.Statement filter) {
    setFilter(filter);
    return this;
  }

  /**
   * Set a property or properties.
   *
   * @param properties the var-args properties
   * @return This
   */
  public CircleLayer withProperties(@NonNull PropertyValue<?>... properties) {
    setProperties(properties);
    return this;
  }

  // Property getters

  /**
   * Get the CircleRadius property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getCircleRadius() {
    return (PropertyValue<Float>) new PropertyValue("circle-radius", nativeGetCircleRadius());
  }

  /**
   * Get the CircleRadius property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleRadiusTransition() {
    long[]durations = nativeGetCircleRadiusTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleRadius property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setCircleRadiusTransition(TransitionOptions options) {
    nativeSetCircleRadiusTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleColor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getCircleColor() {
    return (PropertyValue<String>) new PropertyValue("circle-color", nativeGetCircleColor());
  }

  /**
   * The fill color of the circle.
   *
   * @return int representation of a rgba string color
   * @throws RuntimeException thrown if property isn't a value
   */
  @ColorInt
  public int getCircleColorAsInt() {
    PropertyValue<String> value = getCircleColor();
    if (value.isValue()) {
      return rgbaToColor(value.getValue());
    } else {
      throw new RuntimeException("circle-color was set as a Function");
    }
  }

  /**
   * Get the CircleColor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleColorTransition() {
    long[]durations = nativeGetCircleColorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleColor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setCircleColorTransition(TransitionOptions options) {
    nativeSetCircleColorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleBlur property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getCircleBlur() {
    return (PropertyValue<Float>) new PropertyValue("circle-blur", nativeGetCircleBlur());
  }

  /**
   * Get the CircleBlur property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleBlurTransition() {
    long[]durations = nativeGetCircleBlurTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleBlur property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setCircleBlurTransition(TransitionOptions options) {
    nativeSetCircleBlurTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleOpacity property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getCircleOpacity() {
    return (PropertyValue<Float>) new PropertyValue("circle-opacity", nativeGetCircleOpacity());
  }

  /**
   * Get the CircleOpacity property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleOpacityTransition() {
    long[]durations = nativeGetCircleOpacityTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleOpacity property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setCircleOpacityTransition(TransitionOptions options) {
    nativeSetCircleOpacityTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleTranslate property
   *
   * @return property wrapper value around Float[]
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float[]> getCircleTranslate() {
    return (PropertyValue<Float[]>) new PropertyValue("circle-translate", nativeGetCircleTranslate());
  }

  /**
   * Get the CircleTranslate property transition options
   *
   * @return transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleTranslateTransition() {
    long[]durations = nativeGetCircleTranslateTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleTranslate property transition options
   *
   * @param transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public void setCircleTranslateTransition(TransitionOptions options) {
    nativeSetCircleTranslateTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleTranslateAnchor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getCircleTranslateAnchor() {
    return (PropertyValue<String>) new PropertyValue("circle-translate-anchor", nativeGetCircleTranslateAnchor());
  }

  /**
   * Get the CircleTranslateAnchor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleTranslateAnchorTransition() {
    long[]durations = nativeGetCircleTranslateAnchorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleTranslateAnchor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setCircleTranslateAnchorTransition(TransitionOptions options) {
    nativeSetCircleTranslateAnchorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CirclePitchScale property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getCirclePitchScale() {
    return (PropertyValue<String>) new PropertyValue("circle-pitch-scale", nativeGetCirclePitchScale());
  }

  /**
   * Get the CirclePitchScale property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCirclePitchScaleTransition() {
    long[]durations = nativeGetCirclePitchScaleTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CirclePitchScale property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setCirclePitchScaleTransition(TransitionOptions options) {
    nativeSetCirclePitchScaleTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleStrokeWidth property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getCircleStrokeWidth() {
    return (PropertyValue<Float>) new PropertyValue("circle-stroke-width", nativeGetCircleStrokeWidth());
  }

  /**
   * Get the CircleStrokeWidth property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleStrokeWidthTransition() {
    long[]durations = nativeGetCircleStrokeWidthTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleStrokeWidth property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setCircleStrokeWidthTransition(TransitionOptions options) {
    nativeSetCircleStrokeWidthTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleStrokeColor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getCircleStrokeColor() {
    return (PropertyValue<String>) new PropertyValue("circle-stroke-color", nativeGetCircleStrokeColor());
  }

  /**
   * The stroke color of the circle.
   *
   * @return int representation of a rgba string color
   * @throws RuntimeException thrown if property isn't a value
   */
  @ColorInt
  public int getCircleStrokeColorAsInt() {
    PropertyValue<String> value = getCircleStrokeColor();
    if (value.isValue()) {
      return rgbaToColor(value.getValue());
    } else {
      throw new RuntimeException("circle-stroke-color was set as a Function");
    }
  }

  /**
   * Get the CircleStrokeColor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleStrokeColorTransition() {
    long[]durations = nativeGetCircleStrokeColorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleStrokeColor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setCircleStrokeColorTransition(TransitionOptions options) {
    nativeSetCircleStrokeColorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the CircleStrokeOpacity property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getCircleStrokeOpacity() {
    return (PropertyValue<Float>) new PropertyValue("circle-stroke-opacity", nativeGetCircleStrokeOpacity());
  }

  /**
   * Get the CircleStrokeOpacity property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getCircleStrokeOpacityTransition() {
    long[]durations = nativeGetCircleStrokeOpacityTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the CircleStrokeOpacity property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setCircleStrokeOpacityTransition(TransitionOptions options) {
    nativeSetCircleStrokeOpacityTransition(options.getDuration(), options.getDelay());
  }

  private native Object nativeGetCircleRadius();

  private native long[] nativeGetCircleRadiusTransition();

  private native void nativeSetCircleRadiusTransition(long duration, long delay);

  private native Object nativeGetCircleColor();

  private native long[] nativeGetCircleColorTransition();

  private native void nativeSetCircleColorTransition(long duration, long delay);

  private native Object nativeGetCircleBlur();

  private native long[] nativeGetCircleBlurTransition();

  private native void nativeSetCircleBlurTransition(long duration, long delay);

  private native Object nativeGetCircleOpacity();

  private native long[] nativeGetCircleOpacityTransition();

  private native void nativeSetCircleOpacityTransition(long duration, long delay);

  private native Object nativeGetCircleTranslate();

  private native long[] nativeGetCircleTranslateTransition();

  private native void nativeSetCircleTranslateTransition(long duration, long delay);

  private native Object nativeGetCircleTranslateAnchor();

  private native long[] nativeGetCircleTranslateAnchorTransition();

  private native void nativeSetCircleTranslateAnchorTransition(long duration, long delay);

  private native Object nativeGetCirclePitchScale();

  private native long[] nativeGetCirclePitchScaleTransition();

  private native void nativeSetCirclePitchScaleTransition(long duration, long delay);

  private native Object nativeGetCircleStrokeWidth();

  private native long[] nativeGetCircleStrokeWidthTransition();

  private native void nativeSetCircleStrokeWidthTransition(long duration, long delay);

  private native Object nativeGetCircleStrokeColor();

  private native long[] nativeGetCircleStrokeColorTransition();

  private native void nativeSetCircleStrokeColorTransition(long duration, long delay);

  private native Object nativeGetCircleStrokeOpacity();

  private native long[] nativeGetCircleStrokeOpacityTransition();

  private native void nativeSetCircleStrokeOpacityTransition(long duration, long delay);

  @Override
  protected native void finalize() throws Throwable;

}
