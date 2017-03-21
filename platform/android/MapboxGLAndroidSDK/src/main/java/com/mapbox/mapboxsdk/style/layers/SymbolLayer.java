// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.

package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;

import static com.mapbox.mapboxsdk.utils.ColorUtils.rgbaToColor;

import com.mapbox.mapboxsdk.style.TransitionOptions;

/**
 * An icon or a text label.
 *
 * @see <a href="https://www.mapbox.com/mapbox-gl-style-spec/#layers-symbol">The online documentation</a>
 */
@UiThread
public class SymbolLayer extends Layer {

  /**
   * Creates a SymbolLayer.
   *
   * @param nativePtr pointer used by core
   */
  public SymbolLayer(long nativePtr) {
    super(nativePtr);
  }

  /**
   * Creates a SymbolLayer.
   *
   * @param layerId  the id of the layer
   * @param sourceId the id of the source
   */
  public SymbolLayer(String layerId, String sourceId) {
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
  public SymbolLayer withSourceLayer(String sourceLayer) {
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
  public SymbolLayer withFilter(Filter.Statement filter) {
    setFilter(filter);
    return this;
  }

  /**
   * Set a property or properties.
   *
   * @param properties the var-args properties
   * @return This
   */
  public SymbolLayer withProperties(@NonNull PropertyValue<?>... properties) {
    setProperties(properties);
    return this;
  }

  // Property getters

  /**
   * Get the SymbolPlacement property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getSymbolPlacement() {
    return (PropertyValue<String>) new PropertyValue("symbol-placement", nativeGetSymbolPlacement());
  }

  /**
   * Get the SymbolPlacement property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getSymbolPlacementTransition() {
    long[]durations = nativeGetSymbolPlacementTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the SymbolPlacement property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setSymbolPlacementTransition(TransitionOptions options) {
    nativeSetSymbolPlacementTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the SymbolSpacing property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getSymbolSpacing() {
    return (PropertyValue<Float>) new PropertyValue("symbol-spacing", nativeGetSymbolSpacing());
  }

  /**
   * Get the SymbolSpacing property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getSymbolSpacingTransition() {
    long[]durations = nativeGetSymbolSpacingTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the SymbolSpacing property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setSymbolSpacingTransition(TransitionOptions options) {
    nativeSetSymbolSpacingTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the SymbolAvoidEdges property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getSymbolAvoidEdges() {
    return (PropertyValue<Boolean>) new PropertyValue("symbol-avoid-edges", nativeGetSymbolAvoidEdges());
  }

  /**
   * Get the SymbolAvoidEdges property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getSymbolAvoidEdgesTransition() {
    long[]durations = nativeGetSymbolAvoidEdgesTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the SymbolAvoidEdges property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setSymbolAvoidEdgesTransition(TransitionOptions options) {
    nativeSetSymbolAvoidEdgesTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconAllowOverlap property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getIconAllowOverlap() {
    return (PropertyValue<Boolean>) new PropertyValue("icon-allow-overlap", nativeGetIconAllowOverlap());
  }

  /**
   * Get the IconAllowOverlap property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconAllowOverlapTransition() {
    long[]durations = nativeGetIconAllowOverlapTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconAllowOverlap property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setIconAllowOverlapTransition(TransitionOptions options) {
    nativeSetIconAllowOverlapTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconIgnorePlacement property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getIconIgnorePlacement() {
    return (PropertyValue<Boolean>) new PropertyValue("icon-ignore-placement", nativeGetIconIgnorePlacement());
  }

  /**
   * Get the IconIgnorePlacement property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconIgnorePlacementTransition() {
    long[]durations = nativeGetIconIgnorePlacementTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconIgnorePlacement property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setIconIgnorePlacementTransition(TransitionOptions options) {
    nativeSetIconIgnorePlacementTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconOptional property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getIconOptional() {
    return (PropertyValue<Boolean>) new PropertyValue("icon-optional", nativeGetIconOptional());
  }

  /**
   * Get the IconOptional property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconOptionalTransition() {
    long[]durations = nativeGetIconOptionalTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconOptional property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setIconOptionalTransition(TransitionOptions options) {
    nativeSetIconOptionalTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconRotationAlignment property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getIconRotationAlignment() {
    return (PropertyValue<String>) new PropertyValue("icon-rotation-alignment", nativeGetIconRotationAlignment());
  }

  /**
   * Get the IconRotationAlignment property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconRotationAlignmentTransition() {
    long[]durations = nativeGetIconRotationAlignmentTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconRotationAlignment property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setIconRotationAlignmentTransition(TransitionOptions options) {
    nativeSetIconRotationAlignmentTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconSize property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getIconSize() {
    return (PropertyValue<Float>) new PropertyValue("icon-size", nativeGetIconSize());
  }

  /**
   * Get the IconSize property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconSizeTransition() {
    long[]durations = nativeGetIconSizeTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconSize property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setIconSizeTransition(TransitionOptions options) {
    nativeSetIconSizeTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconTextFit property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getIconTextFit() {
    return (PropertyValue<String>) new PropertyValue("icon-text-fit", nativeGetIconTextFit());
  }

  /**
   * Get the IconTextFit property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconTextFitTransition() {
    long[]durations = nativeGetIconTextFitTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconTextFit property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setIconTextFitTransition(TransitionOptions options) {
    nativeSetIconTextFitTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconTextFitPadding property
   *
   * @return property wrapper value around Float[]
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float[]> getIconTextFitPadding() {
    return (PropertyValue<Float[]>) new PropertyValue("icon-text-fit-padding", nativeGetIconTextFitPadding());
  }

  /**
   * Get the IconTextFitPadding property transition options
   *
   * @return transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconTextFitPaddingTransition() {
    long[]durations = nativeGetIconTextFitPaddingTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconTextFitPadding property transition options
   *
   * @param transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public void setIconTextFitPaddingTransition(TransitionOptions options) {
    nativeSetIconTextFitPaddingTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconImage property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getIconImage() {
    return (PropertyValue<String>) new PropertyValue("icon-image", nativeGetIconImage());
  }

  /**
   * Get the IconImage property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconImageTransition() {
    long[]durations = nativeGetIconImageTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconImage property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setIconImageTransition(TransitionOptions options) {
    nativeSetIconImageTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconRotate property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getIconRotate() {
    return (PropertyValue<Float>) new PropertyValue("icon-rotate", nativeGetIconRotate());
  }

  /**
   * Get the IconRotate property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconRotateTransition() {
    long[]durations = nativeGetIconRotateTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconRotate property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setIconRotateTransition(TransitionOptions options) {
    nativeSetIconRotateTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconPadding property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getIconPadding() {
    return (PropertyValue<Float>) new PropertyValue("icon-padding", nativeGetIconPadding());
  }

  /**
   * Get the IconPadding property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconPaddingTransition() {
    long[]durations = nativeGetIconPaddingTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconPadding property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setIconPaddingTransition(TransitionOptions options) {
    nativeSetIconPaddingTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconKeepUpright property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getIconKeepUpright() {
    return (PropertyValue<Boolean>) new PropertyValue("icon-keep-upright", nativeGetIconKeepUpright());
  }

  /**
   * Get the IconKeepUpright property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconKeepUprightTransition() {
    long[]durations = nativeGetIconKeepUprightTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconKeepUpright property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setIconKeepUprightTransition(TransitionOptions options) {
    nativeSetIconKeepUprightTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconOffset property
   *
   * @return property wrapper value around Float[]
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float[]> getIconOffset() {
    return (PropertyValue<Float[]>) new PropertyValue("icon-offset", nativeGetIconOffset());
  }

  /**
   * Get the IconOffset property transition options
   *
   * @return transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconOffsetTransition() {
    long[]durations = nativeGetIconOffsetTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconOffset property transition options
   *
   * @param transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public void setIconOffsetTransition(TransitionOptions options) {
    nativeSetIconOffsetTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextPitchAlignment property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextPitchAlignment() {
    return (PropertyValue<String>) new PropertyValue("text-pitch-alignment", nativeGetTextPitchAlignment());
  }

  /**
   * Get the TextPitchAlignment property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextPitchAlignmentTransition() {
    long[]durations = nativeGetTextPitchAlignmentTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextPitchAlignment property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextPitchAlignmentTransition(TransitionOptions options) {
    nativeSetTextPitchAlignmentTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextRotationAlignment property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextRotationAlignment() {
    return (PropertyValue<String>) new PropertyValue("text-rotation-alignment", nativeGetTextRotationAlignment());
  }

  /**
   * Get the TextRotationAlignment property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextRotationAlignmentTransition() {
    long[]durations = nativeGetTextRotationAlignmentTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextRotationAlignment property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextRotationAlignmentTransition(TransitionOptions options) {
    nativeSetTextRotationAlignmentTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextField property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextField() {
    return (PropertyValue<String>) new PropertyValue("text-field", nativeGetTextField());
  }

  /**
   * Get the TextField property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextFieldTransition() {
    long[]durations = nativeGetTextFieldTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextField property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextFieldTransition(TransitionOptions options) {
    nativeSetTextFieldTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextFont property
   *
   * @return property wrapper value around String[]
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String[]> getTextFont() {
    return (PropertyValue<String[]>) new PropertyValue("text-font", nativeGetTextFont());
  }

  /**
   * Get the TextFont property transition options
   *
   * @return transition options for String[]
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextFontTransition() {
    long[]durations = nativeGetTextFontTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextFont property transition options
   *
   * @param transition options for String[]
   */
  @SuppressWarnings("unchecked")
  public void setTextFontTransition(TransitionOptions options) {
    nativeSetTextFontTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextSize property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextSize() {
    return (PropertyValue<Float>) new PropertyValue("text-size", nativeGetTextSize());
  }

  /**
   * Get the TextSize property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextSizeTransition() {
    long[]durations = nativeGetTextSizeTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextSize property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextSizeTransition(TransitionOptions options) {
    nativeSetTextSizeTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextMaxWidth property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextMaxWidth() {
    return (PropertyValue<Float>) new PropertyValue("text-max-width", nativeGetTextMaxWidth());
  }

  /**
   * Get the TextMaxWidth property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextMaxWidthTransition() {
    long[]durations = nativeGetTextMaxWidthTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextMaxWidth property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextMaxWidthTransition(TransitionOptions options) {
    nativeSetTextMaxWidthTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextLineHeight property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextLineHeight() {
    return (PropertyValue<Float>) new PropertyValue("text-line-height", nativeGetTextLineHeight());
  }

  /**
   * Get the TextLineHeight property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextLineHeightTransition() {
    long[]durations = nativeGetTextLineHeightTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextLineHeight property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextLineHeightTransition(TransitionOptions options) {
    nativeSetTextLineHeightTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextLetterSpacing property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextLetterSpacing() {
    return (PropertyValue<Float>) new PropertyValue("text-letter-spacing", nativeGetTextLetterSpacing());
  }

  /**
   * Get the TextLetterSpacing property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextLetterSpacingTransition() {
    long[]durations = nativeGetTextLetterSpacingTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextLetterSpacing property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextLetterSpacingTransition(TransitionOptions options) {
    nativeSetTextLetterSpacingTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextJustify property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextJustify() {
    return (PropertyValue<String>) new PropertyValue("text-justify", nativeGetTextJustify());
  }

  /**
   * Get the TextJustify property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextJustifyTransition() {
    long[]durations = nativeGetTextJustifyTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextJustify property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextJustifyTransition(TransitionOptions options) {
    nativeSetTextJustifyTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextAnchor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextAnchor() {
    return (PropertyValue<String>) new PropertyValue("text-anchor", nativeGetTextAnchor());
  }

  /**
   * Get the TextAnchor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextAnchorTransition() {
    long[]durations = nativeGetTextAnchorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextAnchor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextAnchorTransition(TransitionOptions options) {
    nativeSetTextAnchorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextMaxAngle property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextMaxAngle() {
    return (PropertyValue<Float>) new PropertyValue("text-max-angle", nativeGetTextMaxAngle());
  }

  /**
   * Get the TextMaxAngle property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextMaxAngleTransition() {
    long[]durations = nativeGetTextMaxAngleTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextMaxAngle property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextMaxAngleTransition(TransitionOptions options) {
    nativeSetTextMaxAngleTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextRotate property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextRotate() {
    return (PropertyValue<Float>) new PropertyValue("text-rotate", nativeGetTextRotate());
  }

  /**
   * Get the TextRotate property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextRotateTransition() {
    long[]durations = nativeGetTextRotateTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextRotate property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextRotateTransition(TransitionOptions options) {
    nativeSetTextRotateTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextPadding property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextPadding() {
    return (PropertyValue<Float>) new PropertyValue("text-padding", nativeGetTextPadding());
  }

  /**
   * Get the TextPadding property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextPaddingTransition() {
    long[]durations = nativeGetTextPaddingTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextPadding property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextPaddingTransition(TransitionOptions options) {
    nativeSetTextPaddingTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextKeepUpright property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getTextKeepUpright() {
    return (PropertyValue<Boolean>) new PropertyValue("text-keep-upright", nativeGetTextKeepUpright());
  }

  /**
   * Get the TextKeepUpright property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextKeepUprightTransition() {
    long[]durations = nativeGetTextKeepUprightTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextKeepUpright property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setTextKeepUprightTransition(TransitionOptions options) {
    nativeSetTextKeepUprightTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextTransform property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextTransform() {
    return (PropertyValue<String>) new PropertyValue("text-transform", nativeGetTextTransform());
  }

  /**
   * Get the TextTransform property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextTransformTransition() {
    long[]durations = nativeGetTextTransformTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextTransform property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextTransformTransition(TransitionOptions options) {
    nativeSetTextTransformTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextOffset property
   *
   * @return property wrapper value around Float[]
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float[]> getTextOffset() {
    return (PropertyValue<Float[]>) new PropertyValue("text-offset", nativeGetTextOffset());
  }

  /**
   * Get the TextOffset property transition options
   *
   * @return transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextOffsetTransition() {
    long[]durations = nativeGetTextOffsetTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextOffset property transition options
   *
   * @param transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public void setTextOffsetTransition(TransitionOptions options) {
    nativeSetTextOffsetTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextAllowOverlap property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getTextAllowOverlap() {
    return (PropertyValue<Boolean>) new PropertyValue("text-allow-overlap", nativeGetTextAllowOverlap());
  }

  /**
   * Get the TextAllowOverlap property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextAllowOverlapTransition() {
    long[]durations = nativeGetTextAllowOverlapTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextAllowOverlap property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setTextAllowOverlapTransition(TransitionOptions options) {
    nativeSetTextAllowOverlapTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextIgnorePlacement property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getTextIgnorePlacement() {
    return (PropertyValue<Boolean>) new PropertyValue("text-ignore-placement", nativeGetTextIgnorePlacement());
  }

  /**
   * Get the TextIgnorePlacement property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextIgnorePlacementTransition() {
    long[]durations = nativeGetTextIgnorePlacementTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextIgnorePlacement property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setTextIgnorePlacementTransition(TransitionOptions options) {
    nativeSetTextIgnorePlacementTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextOptional property
   *
   * @return property wrapper value around Boolean
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Boolean> getTextOptional() {
    return (PropertyValue<Boolean>) new PropertyValue("text-optional", nativeGetTextOptional());
  }

  /**
   * Get the TextOptional property transition options
   *
   * @return transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextOptionalTransition() {
    long[]durations = nativeGetTextOptionalTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextOptional property transition options
   *
   * @param transition options for Boolean
   */
  @SuppressWarnings("unchecked")
  public void setTextOptionalTransition(TransitionOptions options) {
    nativeSetTextOptionalTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconOpacity property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getIconOpacity() {
    return (PropertyValue<Float>) new PropertyValue("icon-opacity", nativeGetIconOpacity());
  }

  /**
   * Get the IconOpacity property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconOpacityTransition() {
    long[]durations = nativeGetIconOpacityTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconOpacity property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setIconOpacityTransition(TransitionOptions options) {
    nativeSetIconOpacityTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconColor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getIconColor() {
    return (PropertyValue<String>) new PropertyValue("icon-color", nativeGetIconColor());
  }

  /**
   * The color of the icon. This can only be used with sdf icons.
   *
   * @return int representation of a rgba string color
   * @throws RuntimeException thrown if property isn't a value
   */
  @ColorInt
  public int getIconColorAsInt() {
    PropertyValue<String> value = getIconColor();
    if (value.isValue()) {
      return rgbaToColor(value.getValue());
    } else {
      throw new RuntimeException("icon-color was set as a Function");
    }
  }

  /**
   * Get the IconColor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconColorTransition() {
    long[]durations = nativeGetIconColorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconColor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setIconColorTransition(TransitionOptions options) {
    nativeSetIconColorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconHaloColor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getIconHaloColor() {
    return (PropertyValue<String>) new PropertyValue("icon-halo-color", nativeGetIconHaloColor());
  }

  /**
   * The color of the icon's halo. Icon halos can only be used with SDF icons.
   *
   * @return int representation of a rgba string color
   * @throws RuntimeException thrown if property isn't a value
   */
  @ColorInt
  public int getIconHaloColorAsInt() {
    PropertyValue<String> value = getIconHaloColor();
    if (value.isValue()) {
      return rgbaToColor(value.getValue());
    } else {
      throw new RuntimeException("icon-halo-color was set as a Function");
    }
  }

  /**
   * Get the IconHaloColor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconHaloColorTransition() {
    long[]durations = nativeGetIconHaloColorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconHaloColor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setIconHaloColorTransition(TransitionOptions options) {
    nativeSetIconHaloColorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconHaloWidth property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getIconHaloWidth() {
    return (PropertyValue<Float>) new PropertyValue("icon-halo-width", nativeGetIconHaloWidth());
  }

  /**
   * Get the IconHaloWidth property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconHaloWidthTransition() {
    long[]durations = nativeGetIconHaloWidthTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconHaloWidth property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setIconHaloWidthTransition(TransitionOptions options) {
    nativeSetIconHaloWidthTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconHaloBlur property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getIconHaloBlur() {
    return (PropertyValue<Float>) new PropertyValue("icon-halo-blur", nativeGetIconHaloBlur());
  }

  /**
   * Get the IconHaloBlur property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconHaloBlurTransition() {
    long[]durations = nativeGetIconHaloBlurTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconHaloBlur property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setIconHaloBlurTransition(TransitionOptions options) {
    nativeSetIconHaloBlurTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconTranslate property
   *
   * @return property wrapper value around Float[]
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float[]> getIconTranslate() {
    return (PropertyValue<Float[]>) new PropertyValue("icon-translate", nativeGetIconTranslate());
  }

  /**
   * Get the IconTranslate property transition options
   *
   * @return transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconTranslateTransition() {
    long[]durations = nativeGetIconTranslateTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconTranslate property transition options
   *
   * @param transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public void setIconTranslateTransition(TransitionOptions options) {
    nativeSetIconTranslateTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the IconTranslateAnchor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getIconTranslateAnchor() {
    return (PropertyValue<String>) new PropertyValue("icon-translate-anchor", nativeGetIconTranslateAnchor());
  }

  /**
   * Get the IconTranslateAnchor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getIconTranslateAnchorTransition() {
    long[]durations = nativeGetIconTranslateAnchorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the IconTranslateAnchor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setIconTranslateAnchorTransition(TransitionOptions options) {
    nativeSetIconTranslateAnchorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextOpacity property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextOpacity() {
    return (PropertyValue<Float>) new PropertyValue("text-opacity", nativeGetTextOpacity());
  }

  /**
   * Get the TextOpacity property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextOpacityTransition() {
    long[]durations = nativeGetTextOpacityTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextOpacity property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextOpacityTransition(TransitionOptions options) {
    nativeSetTextOpacityTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextColor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextColor() {
    return (PropertyValue<String>) new PropertyValue("text-color", nativeGetTextColor());
  }

  /**
   * The color with which the text will be drawn.
   *
   * @return int representation of a rgba string color
   * @throws RuntimeException thrown if property isn't a value
   */
  @ColorInt
  public int getTextColorAsInt() {
    PropertyValue<String> value = getTextColor();
    if (value.isValue()) {
      return rgbaToColor(value.getValue());
    } else {
      throw new RuntimeException("text-color was set as a Function");
    }
  }

  /**
   * Get the TextColor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextColorTransition() {
    long[]durations = nativeGetTextColorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextColor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextColorTransition(TransitionOptions options) {
    nativeSetTextColorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextHaloColor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextHaloColor() {
    return (PropertyValue<String>) new PropertyValue("text-halo-color", nativeGetTextHaloColor());
  }

  /**
   * The color of the text's halo, which helps it stand out from backgrounds.
   *
   * @return int representation of a rgba string color
   * @throws RuntimeException thrown if property isn't a value
   */
  @ColorInt
  public int getTextHaloColorAsInt() {
    PropertyValue<String> value = getTextHaloColor();
    if (value.isValue()) {
      return rgbaToColor(value.getValue());
    } else {
      throw new RuntimeException("text-halo-color was set as a Function");
    }
  }

  /**
   * Get the TextHaloColor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextHaloColorTransition() {
    long[]durations = nativeGetTextHaloColorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextHaloColor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextHaloColorTransition(TransitionOptions options) {
    nativeSetTextHaloColorTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextHaloWidth property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextHaloWidth() {
    return (PropertyValue<Float>) new PropertyValue("text-halo-width", nativeGetTextHaloWidth());
  }

  /**
   * Get the TextHaloWidth property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextHaloWidthTransition() {
    long[]durations = nativeGetTextHaloWidthTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextHaloWidth property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextHaloWidthTransition(TransitionOptions options) {
    nativeSetTextHaloWidthTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextHaloBlur property
   *
   * @return property wrapper value around Float
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float> getTextHaloBlur() {
    return (PropertyValue<Float>) new PropertyValue("text-halo-blur", nativeGetTextHaloBlur());
  }

  /**
   * Get the TextHaloBlur property transition options
   *
   * @return transition options for Float
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextHaloBlurTransition() {
    long[]durations = nativeGetTextHaloBlurTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextHaloBlur property transition options
   *
   * @param transition options for Float
   */
  @SuppressWarnings("unchecked")
  public void setTextHaloBlurTransition(TransitionOptions options) {
    nativeSetTextHaloBlurTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextTranslate property
   *
   * @return property wrapper value around Float[]
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<Float[]> getTextTranslate() {
    return (PropertyValue<Float[]>) new PropertyValue("text-translate", nativeGetTextTranslate());
  }

  /**
   * Get the TextTranslate property transition options
   *
   * @return transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextTranslateTransition() {
    long[]durations = nativeGetTextTranslateTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextTranslate property transition options
   *
   * @param transition options for Float[]
   */
  @SuppressWarnings("unchecked")
  public void setTextTranslateTransition(TransitionOptions options) {
    nativeSetTextTranslateTransition(options.getDuration(), options.getDelay());
  }

  /**
   * Get the TextTranslateAnchor property
   *
   * @return property wrapper value around String
   */
  @SuppressWarnings("unchecked")
  public PropertyValue<String> getTextTranslateAnchor() {
    return (PropertyValue<String>) new PropertyValue("text-translate-anchor", nativeGetTextTranslateAnchor());
  }

  /**
   * Get the TextTranslateAnchor property transition options
   *
   * @return transition options for String
   */
  @SuppressWarnings("unchecked")
  public TransitionOptions getTextTranslateAnchorTransition() {
    long[]durations = nativeGetTextTranslateAnchorTransition();
    return new TransitionOptions(durations[0], durations[1]);
  }

 /**
   * Set the TextTranslateAnchor property transition options
   *
   * @param transition options for String
   */
  @SuppressWarnings("unchecked")
  public void setTextTranslateAnchorTransition(TransitionOptions options) {
    nativeSetTextTranslateAnchorTransition(options.getDuration(), options.getDelay());
  }

  private native Object nativeGetSymbolPlacement();

  private native long[] nativeGetSymbolPlacementTransition();

  private native void nativeSetSymbolPlacementTransition(long duration, long delay);

  private native Object nativeGetSymbolSpacing();

  private native long[] nativeGetSymbolSpacingTransition();

  private native void nativeSetSymbolSpacingTransition(long duration, long delay);

  private native Object nativeGetSymbolAvoidEdges();

  private native long[] nativeGetSymbolAvoidEdgesTransition();

  private native void nativeSetSymbolAvoidEdgesTransition(long duration, long delay);

  private native Object nativeGetIconAllowOverlap();

  private native long[] nativeGetIconAllowOverlapTransition();

  private native void nativeSetIconAllowOverlapTransition(long duration, long delay);

  private native Object nativeGetIconIgnorePlacement();

  private native long[] nativeGetIconIgnorePlacementTransition();

  private native void nativeSetIconIgnorePlacementTransition(long duration, long delay);

  private native Object nativeGetIconOptional();

  private native long[] nativeGetIconOptionalTransition();

  private native void nativeSetIconOptionalTransition(long duration, long delay);

  private native Object nativeGetIconRotationAlignment();

  private native long[] nativeGetIconRotationAlignmentTransition();

  private native void nativeSetIconRotationAlignmentTransition(long duration, long delay);

  private native Object nativeGetIconSize();

  private native long[] nativeGetIconSizeTransition();

  private native void nativeSetIconSizeTransition(long duration, long delay);

  private native Object nativeGetIconTextFit();

  private native long[] nativeGetIconTextFitTransition();

  private native void nativeSetIconTextFitTransition(long duration, long delay);

  private native Object nativeGetIconTextFitPadding();

  private native long[] nativeGetIconTextFitPaddingTransition();

  private native void nativeSetIconTextFitPaddingTransition(long duration, long delay);

  private native Object nativeGetIconImage();

  private native long[] nativeGetIconImageTransition();

  private native void nativeSetIconImageTransition(long duration, long delay);

  private native Object nativeGetIconRotate();

  private native long[] nativeGetIconRotateTransition();

  private native void nativeSetIconRotateTransition(long duration, long delay);

  private native Object nativeGetIconPadding();

  private native long[] nativeGetIconPaddingTransition();

  private native void nativeSetIconPaddingTransition(long duration, long delay);

  private native Object nativeGetIconKeepUpright();

  private native long[] nativeGetIconKeepUprightTransition();

  private native void nativeSetIconKeepUprightTransition(long duration, long delay);

  private native Object nativeGetIconOffset();

  private native long[] nativeGetIconOffsetTransition();

  private native void nativeSetIconOffsetTransition(long duration, long delay);

  private native Object nativeGetTextPitchAlignment();

  private native long[] nativeGetTextPitchAlignmentTransition();

  private native void nativeSetTextPitchAlignmentTransition(long duration, long delay);

  private native Object nativeGetTextRotationAlignment();

  private native long[] nativeGetTextRotationAlignmentTransition();

  private native void nativeSetTextRotationAlignmentTransition(long duration, long delay);

  private native Object nativeGetTextField();

  private native long[] nativeGetTextFieldTransition();

  private native void nativeSetTextFieldTransition(long duration, long delay);

  private native Object nativeGetTextFont();

  private native long[] nativeGetTextFontTransition();

  private native void nativeSetTextFontTransition(long duration, long delay);

  private native Object nativeGetTextSize();

  private native long[] nativeGetTextSizeTransition();

  private native void nativeSetTextSizeTransition(long duration, long delay);

  private native Object nativeGetTextMaxWidth();

  private native long[] nativeGetTextMaxWidthTransition();

  private native void nativeSetTextMaxWidthTransition(long duration, long delay);

  private native Object nativeGetTextLineHeight();

  private native long[] nativeGetTextLineHeightTransition();

  private native void nativeSetTextLineHeightTransition(long duration, long delay);

  private native Object nativeGetTextLetterSpacing();

  private native long[] nativeGetTextLetterSpacingTransition();

  private native void nativeSetTextLetterSpacingTransition(long duration, long delay);

  private native Object nativeGetTextJustify();

  private native long[] nativeGetTextJustifyTransition();

  private native void nativeSetTextJustifyTransition(long duration, long delay);

  private native Object nativeGetTextAnchor();

  private native long[] nativeGetTextAnchorTransition();

  private native void nativeSetTextAnchorTransition(long duration, long delay);

  private native Object nativeGetTextMaxAngle();

  private native long[] nativeGetTextMaxAngleTransition();

  private native void nativeSetTextMaxAngleTransition(long duration, long delay);

  private native Object nativeGetTextRotate();

  private native long[] nativeGetTextRotateTransition();

  private native void nativeSetTextRotateTransition(long duration, long delay);

  private native Object nativeGetTextPadding();

  private native long[] nativeGetTextPaddingTransition();

  private native void nativeSetTextPaddingTransition(long duration, long delay);

  private native Object nativeGetTextKeepUpright();

  private native long[] nativeGetTextKeepUprightTransition();

  private native void nativeSetTextKeepUprightTransition(long duration, long delay);

  private native Object nativeGetTextTransform();

  private native long[] nativeGetTextTransformTransition();

  private native void nativeSetTextTransformTransition(long duration, long delay);

  private native Object nativeGetTextOffset();

  private native long[] nativeGetTextOffsetTransition();

  private native void nativeSetTextOffsetTransition(long duration, long delay);

  private native Object nativeGetTextAllowOverlap();

  private native long[] nativeGetTextAllowOverlapTransition();

  private native void nativeSetTextAllowOverlapTransition(long duration, long delay);

  private native Object nativeGetTextIgnorePlacement();

  private native long[] nativeGetTextIgnorePlacementTransition();

  private native void nativeSetTextIgnorePlacementTransition(long duration, long delay);

  private native Object nativeGetTextOptional();

  private native long[] nativeGetTextOptionalTransition();

  private native void nativeSetTextOptionalTransition(long duration, long delay);

  private native Object nativeGetIconOpacity();

  private native long[] nativeGetIconOpacityTransition();

  private native void nativeSetIconOpacityTransition(long duration, long delay);

  private native Object nativeGetIconColor();

  private native long[] nativeGetIconColorTransition();

  private native void nativeSetIconColorTransition(long duration, long delay);

  private native Object nativeGetIconHaloColor();

  private native long[] nativeGetIconHaloColorTransition();

  private native void nativeSetIconHaloColorTransition(long duration, long delay);

  private native Object nativeGetIconHaloWidth();

  private native long[] nativeGetIconHaloWidthTransition();

  private native void nativeSetIconHaloWidthTransition(long duration, long delay);

  private native Object nativeGetIconHaloBlur();

  private native long[] nativeGetIconHaloBlurTransition();

  private native void nativeSetIconHaloBlurTransition(long duration, long delay);

  private native Object nativeGetIconTranslate();

  private native long[] nativeGetIconTranslateTransition();

  private native void nativeSetIconTranslateTransition(long duration, long delay);

  private native Object nativeGetIconTranslateAnchor();

  private native long[] nativeGetIconTranslateAnchorTransition();

  private native void nativeSetIconTranslateAnchorTransition(long duration, long delay);

  private native Object nativeGetTextOpacity();

  private native long[] nativeGetTextOpacityTransition();

  private native void nativeSetTextOpacityTransition(long duration, long delay);

  private native Object nativeGetTextColor();

  private native long[] nativeGetTextColorTransition();

  private native void nativeSetTextColorTransition(long duration, long delay);

  private native Object nativeGetTextHaloColor();

  private native long[] nativeGetTextHaloColorTransition();

  private native void nativeSetTextHaloColorTransition(long duration, long delay);

  private native Object nativeGetTextHaloWidth();

  private native long[] nativeGetTextHaloWidthTransition();

  private native void nativeSetTextHaloWidthTransition(long duration, long delay);

  private native Object nativeGetTextHaloBlur();

  private native long[] nativeGetTextHaloBlurTransition();

  private native void nativeSetTextHaloBlurTransition(long duration, long delay);

  private native Object nativeGetTextTranslate();

  private native long[] nativeGetTextTranslateTransition();

  private native void nativeSetTextTranslateTransition(long duration, long delay);

  private native Object nativeGetTextTranslateAnchor();

  private native long[] nativeGetTextTranslateAnchorTransition();

  private native void nativeSetTextTranslateAnchorTransition(long duration, long delay);

  @Override
  protected native void finalize() throws Throwable;

}
