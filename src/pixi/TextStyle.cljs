(ns pixi.TextStyle
  "A TextStyle Object contains information to decorate a Text objects.
  An instance can be shared between multiple Text objects; then
  the style will update all text objects using it.
  A tool can be used to generate a text style [here](https://pixijs.io/pixi-text-style)."
  (:refer-clojure :exclude [clone]))

(defn new
  "Constructor."
  ([]
    (new js/TextStyle))
  ([style]
    (new js/TextStyle style)))

(defn clone
  "Method.

  Member of TextStyle.

  Creates a new TextStyle object with the same values as this one.
  Note that the only the properties of the object are cloned."
  ([this]
    (-> this (.clone))))

(defn reset
  "Method.

  Member of TextStyle.

  Resets all properties to the defaults specified in TextStyle.prototype._default"
  ([this]
    (-> this (.reset))))

(defn to-font-string
  "Method.

  Member of TextStyle.

  Generates a font style string to use for `TextMetrics.measureFont()`."
  ([this]
    (-> this (.toFontString))))

(defn align
  "Property.

  Member of TextStyle.

  Alignment for multiline text ('left', 'center' or 'right'), does
  affect single line text"
  [this]
  (-> this .-align))

(defn set-align!
  "Property.

  Member of TextStyle.

  Alignment for multiline text ('left', 'center' or 'right'), does
  affect single line text"
  [this val]
  (aset this "align" val))

(defn break-words
  "Property.

  Member of TextStyle.

  Indicates if lines can be wrapped within words, it needs wordWrap
  be set to true"
  [this]
  (-> this .-breakWords))

(defn set-break-words!
  "Property.

  Member of TextStyle.

  Indicates if lines can be wrapped within words, it needs wordWrap
  be set to true"
  [this val]
  (aset this "breakWords" val))

(defn drop-shadow
  "Property.

  Member of TextStyle.

  Set a drop shadow for the text"
  [this]
  (-> this .-dropShadow))

(defn set-drop-shadow!
  "Property.

  Member of TextStyle.

  Set a drop shadow for the text"
  [this val]
  (aset this "dropShadow" val))

(defn drop-shadow-alpha
  "Property.

  Member of TextStyle.

  Set alpha for the drop shadow"
  [this]
  (-> this .-dropShadowAlpha))

(defn set-drop-shadow-alpha!
  "Property.

  Member of TextStyle.

  Set alpha for the drop shadow"
  [this val]
  (aset this "dropShadowAlpha" val))

(defn drop-shadow-angle
  "Property.

  Member of TextStyle.

  Set a angle of the drop shadow"
  [this]
  (-> this .-dropShadowAngle))

(defn set-drop-shadow-angle!
  "Property.

  Member of TextStyle.

  Set a angle of the drop shadow"
  [this val]
  (aset this "dropShadowAngle" val))

(defn drop-shadow-blur
  "Property.

  Member of TextStyle.

  Set a shadow blur radius"
  [this]
  (-> this .-dropShadowBlur))

(defn set-drop-shadow-blur!
  "Property.

  Member of TextStyle.

  Set a shadow blur radius"
  [this val]
  (aset this "dropShadowBlur" val))

(defn drop-shadow-color
  "Property.

  Member of TextStyle.

  A fill style to be used on the dropshadow e.g 'red', '#00FF00'"
  [this]
  (-> this .-dropShadowColor))

(defn set-drop-shadow-color!
  "Property.

  Member of TextStyle.

  A fill style to be used on the dropshadow e.g 'red', '#00FF00'"
  [this val]
  (aset this "dropShadowColor" val))

(defn drop-shadow-distance
  "Property.

  Member of TextStyle.

  Set a distance of the drop shadow"
  [this]
  (-> this .-dropShadowDistance))

(defn set-drop-shadow-distance!
  "Property.

  Member of TextStyle.

  Set a distance of the drop shadow"
  [this val]
  (aset this "dropShadowDistance" val))

(defn fill
  "Property.

  Member of TextStyle.

  A canvas fillstyle that will be used on the text e.g 'red', '#00FF00'.
  Can be an array to create a gradient eg ['#000000','#FFFFFF']
  {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}"
  [this]
  (-> this .-fill))

(defn set-fill!
  "Property.

  Member of TextStyle.

  A canvas fillstyle that will be used on the text e.g 'red', '#00FF00'.
  Can be an array to create a gradient eg ['#000000','#FFFFFF']
  {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}"
  [this val]
  (aset this "fill" val))

(defn fill-gradient-stops
  "Property.

  Member of TextStyle.

  If fill is an array of colours to create a gradient, this array
  set the stop points
  (numbers between 0 and 1) for the color, overriding the default
  of evenly spacing them."
  [this]
  (-> this .-fillGradientStops))

(defn set-fill-gradient-stops!
  "Property.

  Member of TextStyle.

  If fill is an array of colours to create a gradient, this array
  set the stop points
  (numbers between 0 and 1) for the color, overriding the default
  of evenly spacing them."
  [this val]
  (aset this "fillGradientStops" val))

(defn fill-gradient-type
  "Property.

  Member of TextStyle.

  If fill is an array of colours to create a gradient, this can
  the type/direction of the gradient.
  See {@link PIXI.TEXT_GRADIENT}"
  [this]
  (-> this .-fillGradientType))

(defn set-fill-gradient-type!
  "Property.

  Member of TextStyle.

  If fill is an array of colours to create a gradient, this can
  the type/direction of the gradient.
  See {@link PIXI.TEXT_GRADIENT}"
  [this val]
  (aset this "fillGradientType" val))

(defn font-family
  "Property.

  Member of TextStyle.

  The font family"
  [this]
  (-> this .-fontFamily))

(defn set-font-family!
  "Property.

  Member of TextStyle.

  The font family"
  [this val]
  (aset this "fontFamily" val))

(defn font-size
  "Property.

  Member of TextStyle.

  The font size
  (as a number it converts to px, but as a string, equivalents
  '26px','20pt','160%' or '1.6em')"
  [this]
  (-> this .-fontSize))

(defn set-font-size!
  "Property.

  Member of TextStyle.

  The font size
  (as a number it converts to px, but as a string, equivalents
  '26px','20pt','160%' or '1.6em')"
  [this val]
  (aset this "fontSize" val))

(defn font-style
  "Property.

  Member of TextStyle.

  The font style
  ('normal', 'italic' or 'oblique')"
  [this]
  (-> this .-fontStyle))

(defn set-font-style!
  "Property.

  Member of TextStyle.

  The font style
  ('normal', 'italic' or 'oblique')"
  [this val]
  (aset this "fontStyle" val))

(defn font-variant
  "Property.

  Member of TextStyle.

  The font variant
  ('normal' or 'small-caps')"
  [this]
  (-> this .-fontVariant))

(defn set-font-variant!
  "Property.

  Member of TextStyle.

  The font variant
  ('normal' or 'small-caps')"
  [this val]
  (aset this "fontVariant" val))

(defn font-weight
  "Property.

  Member of TextStyle.

  The font weight
  ('normal', 'bold', 'bolder', 'lighter' and '100', '200', '300',
  '500', '600', '700', 800' or '900')"
  [this]
  (-> this .-fontWeight))

(defn set-font-weight!
  "Property.

  Member of TextStyle.

  The font weight
  ('normal', 'bold', 'bolder', 'lighter' and '100', '200', '300',
  '500', '600', '700', 800' or '900')"
  [this val]
  (aset this "fontWeight" val))

(defn leading
  "Property.

  Member of TextStyle.

  The space between lines"
  [this]
  (-> this .-leading))

(defn set-leading!
  "Property.

  Member of TextStyle.

  The space between lines"
  [this val]
  (aset this "leading" val))

(defn letter-spacing
  "Property.

  Member of TextStyle.

  The amount of spacing between letters, default is 0"
  [this]
  (-> this .-letterSpacing))

(defn set-letter-spacing!
  "Property.

  Member of TextStyle.

  The amount of spacing between letters, default is 0"
  [this val]
  (aset this "letterSpacing" val))

(defn line-height
  "Property.

  Member of TextStyle.

  The line height, a number that represents the vertical space
  a letter uses"
  [this]
  (-> this .-lineHeight))

(defn set-line-height!
  "Property.

  Member of TextStyle.

  The line height, a number that represents the vertical space
  a letter uses"
  [this val]
  (aset this "lineHeight" val))

(defn line-join
  "Property.

  Member of TextStyle.

  The lineJoin property sets the type of corner created, it can
  spiked text issues.
  Default is 'miter' (creates a sharp corner)."
  [this]
  (-> this .-lineJoin))

(defn set-line-join!
  "Property.

  Member of TextStyle.

  The lineJoin property sets the type of corner created, it can
  spiked text issues.
  Default is 'miter' (creates a sharp corner)."
  [this val]
  (aset this "lineJoin" val))

(defn miter-limit
  "Property.

  Member of TextStyle.

  The miter limit to use when using the 'miter' lineJoin mode
  This can reduce or increase the spikiness of rendered text."
  [this]
  (-> this .-miterLimit))

(defn set-miter-limit!
  "Property.

  Member of TextStyle.

  The miter limit to use when using the 'miter' lineJoin mode
  This can reduce or increase the spikiness of rendered text."
  [this val]
  (aset this "miterLimit" val))

(defn padding
  "Property.

  Member of TextStyle.

  Occasionally some fonts are cropped. Adding some padding will
  this from happening
  by adding padding to all sides of the text."
  [this]
  (-> this .-padding))

(defn set-padding!
  "Property.

  Member of TextStyle.

  Occasionally some fonts are cropped. Adding some padding will
  this from happening
  by adding padding to all sides of the text."
  [this val]
  (aset this "padding" val))

(defn stroke
  "Property.

  Member of TextStyle.

  A canvas fillstyle that will be used on the text stroke
  e.g 'blue', '#FCFF00'"
  [this]
  (-> this .-stroke))

(defn set-stroke!
  "Property.

  Member of TextStyle.

  A canvas fillstyle that will be used on the text stroke
  e.g 'blue', '#FCFF00'"
  [this val]
  (aset this "stroke" val))

(defn stroke-thickness
  "Property.

  Member of TextStyle.

  A number that represents the thickness of the stroke.
  Default is 0 (no stroke)"
  [this]
  (-> this .-strokeThickness))

(defn set-stroke-thickness!
  "Property.

  Member of TextStyle.

  A number that represents the thickness of the stroke.
  Default is 0 (no stroke)"
  [this val]
  (aset this "strokeThickness" val))

(defn text-baseline
  "Property.

  Member of TextStyle.

  The baseline of the text that is rendered."
  [this]
  (-> this .-textBaseline))

(defn set-text-baseline!
  "Property.

  Member of TextStyle.

  The baseline of the text that is rendered."
  [this val]
  (aset this "textBaseline" val))

(defn trim
  "Property.

  Member of TextStyle.

  Trim transparent borders"
  [this]
  (-> this .-trim))

(defn set-trim!
  "Property.

  Member of TextStyle.

  Trim transparent borders"
  [this val]
  (aset this "trim" val))

(defn white-space
  "Property.

  Member of TextStyle.

  How newlines and spaces should be handled.
  Default is 'pre' (preserve, preserve).
  value | New lines | Spaces
  --- | --- | ---
  'normal' | Collapse | Collapse
  'pre' | Preserve | Preserve
  'pre-line' | Preserve | Collapse"
  [this]
  (-> this .-whiteSpace))

(defn set-white-space!
  "Property.

  Member of TextStyle.

  How newlines and spaces should be handled.
  Default is 'pre' (preserve, preserve).
  value | New lines | Spaces
  --- | --- | ---
  'normal' | Collapse | Collapse
  'pre' | Preserve | Preserve
  'pre-line' | Preserve | Collapse"
  [this val]
  (aset this "whiteSpace" val))

(defn word-wrap
  "Property.

  Member of TextStyle.

  Indicates if word wrap should be used"
  [this]
  (-> this .-wordWrap))

(defn set-word-wrap!
  "Property.

  Member of TextStyle.

  Indicates if word wrap should be used"
  [this val]
  (aset this "wordWrap" val))

(defn word-wrap-width
  "Property.

  Member of TextStyle.

  The width at which text will wrap, it needs wordWrap to be set
  true"
  [this]
  (-> this .-wordWrapWidth))

(defn set-word-wrap-width!
  "Property.

  Member of TextStyle.

  The width at which text will wrap, it needs wordWrap to be set
  true"
  [this val]
  (aset this "wordWrapWidth" val))

