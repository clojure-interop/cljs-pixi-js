(ns pixi.TextMetrics
  "The TextMetrics object represents the measurement of a block
  text with a specified style.
  ```js
  let style = new PIXI.TextStyle({fontFamily : 'Arial', fontSize:
  fill : 0xff1010, align : 'center'})
  let textMetrics = PIXI.TextMetrics.measureText('Your text', style)
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([text style width height lines line-widths line-height max-line-width font-properties]
    (new js/TextMetrics text style width height lines line-widths line-height max-line-width font-properties)))

(defn *add-line
  "Method.

  Member of TextMetrics.

  Convienience function for logging each line added during the
  method"
  ([line new-line]
    (-> js/TextMetrics (.addLine line new-line))))

(defn *can-break-chars
  "Method.

  Member of TextMetrics.

  This method exists to be easily overridden
  It allows one to determine whether a pair of characters
  should be broken by newlines
  For example certain characters in CJK langs or numbers.
  It must return a boolean."
  ([char next-char token index break-words]
    (-> js/TextMetrics (.canBreakChars char next-char token index break-words))))

(defn *can-break-words
  "Method.

  Member of TextMetrics.

  This method exists to be easily overridden
  It allows one to customise which words should break
  Examples are if the token is CJK or numbers.
  It must return a boolean."
  ([token break-words]
    (-> js/TextMetrics (.canBreakWords token break-words))))

(defn *clear-metrics
  "Method.

  Member of TextMetrics.

  Clear font metrics in metrics cache."
  ([]
    (-> js/TextMetrics (.clearMetrics)))
  ([font]
    (-> js/TextMetrics (.clearMetrics font))))

(defn *collapse-newlines
  "Method.

  Member of TextMetrics.

  Determines whether we should collapse newLine chars"
  ([white-space]
    (-> js/TextMetrics (.collapseNewlines white-space))))

(defn *collapse-spaces
  "Method.

  Member of TextMetrics.

  Determines whether we should collapse breaking spaces"
  ([white-space]
    (-> js/TextMetrics (.collapseSpaces white-space))))

(defn *get-from-cache
  "Method.

  Member of TextMetrics.

  Gets & sets the widths of calculated characters in a cache object"
  ([key letter-spacing cache context]
    (-> js/TextMetrics (.getFromCache key letter-spacing cache context))))

(defn *is-breaking-space
  "Method.

  Member of TextMetrics.

  Determines if char is a breaking whitespace."
  ([char]
    (-> js/TextMetrics (.isBreakingSpace char))))

(defn *is-newline
  "Method.

  Member of TextMetrics.

  Determines if char is a newline."
  ([char]
    (-> js/TextMetrics (.isNewline char))))

(defn *measure-font
  "Method.

  Member of TextMetrics.

  Calculates the ascent, descent and fontSize of a given font-style"
  ([font]
    (-> js/TextMetrics (.measureFont font))))

(defn *measure-text
  "Method.

  Member of TextMetrics.

  Measures the supplied string of text and returns a Rectangle."
  ([text style]
    (-> js/TextMetrics (.measureText text style)))
  ([text style word-wrap]
    (-> js/TextMetrics (.measureText text style word-wrap)))
  ([text style word-wrap canvas]
    (-> js/TextMetrics (.measureText text style word-wrap canvas))))

(defn *tokenize
  "Method.

  Member of TextMetrics.

  Splits a string into words, breaking-spaces and newLine characters"
  ([text]
    (-> js/TextMetrics (.tokenize text))))

(defn *trim-right
  "Method.

  Member of TextMetrics.

  trims breaking whitespaces from string"
  ([text]
    (-> js/TextMetrics (.trimRight text))))

(defn *word-wrap
  "Method.

  Member of TextMetrics.

  Applies newlines to a string to have it optimally fit into the
  bounds set by the Text object's wordWrapWidth property."
  ([text style]
    (-> js/TextMetrics (.wordWrap text style)))
  ([text style canvas]
    (-> js/TextMetrics (.wordWrap text style canvas))))

(defn baseline-multiplier
  "Property.

  Member of TextMetrics.

  Baseline multiplier for calculate font metrics."
  []
  (-> js/TextMetrics .-BASELINE_MULTIPLIER))

(defn set-baseline-multiplier!
  "Property.

  Member of TextMetrics.

  Baseline multiplier for calculate font metrics."
  [val]
  (aset js/TextMetrics "BASELINE_MULTIPLIER" val))

(defn baseline-symbol
  "Property.

  Member of TextMetrics.

  Baseline symbol for calculate font metrics."
  []
  (-> js/TextMetrics .-BASELINE_SYMBOL))

(defn set-baseline-symbol!
  "Property.

  Member of TextMetrics.

  Baseline symbol for calculate font metrics."
  [val]
  (aset js/TextMetrics "BASELINE_SYMBOL" val))

(defn metrics-string
  "Property.

  Member of TextMetrics.

  String used for calculate font metrics.
  These characters are all tall to help calculate the height required
  text."
  []
  (-> js/TextMetrics .-METRICS_STRING))

(defn set-metrics-string!
  "Property.

  Member of TextMetrics.

  String used for calculate font metrics.
  These characters are all tall to help calculate the height required
  text."
  [val]
  (aset js/TextMetrics "METRICS_STRING" val))

(defn text-metrics.-breaking-spaces
  "Property.

  Member of TextMetrics.

  Cache of breaking spaces."
  []
  (-> js/TextMetrics .-TextMetrics._breakingSpaces))

(defn set-text-metrics.-breaking-spaces!
  "Property.

  Member of TextMetrics.

  Cache of breaking spaces."
  [val]
  (aset js/TextMetrics "TextMetrics._breakingSpaces" val))

(defn text-metrics.-canvas
  "Property.

  Member of TextMetrics.

  Cached canvas element for measuring text"
  []
  (-> js/TextMetrics .-TextMetrics._canvas))

(defn set-text-metrics.-canvas!
  "Property.

  Member of TextMetrics.

  Cached canvas element for measuring text"
  [val]
  (aset js/TextMetrics "TextMetrics._canvas" val))

(defn text-metrics.-context
  "Property.

  Member of TextMetrics.

  Cache for context to use."
  []
  (-> js/TextMetrics .-TextMetrics._context))

(defn set-text-metrics.-context!
  "Property.

  Member of TextMetrics.

  Cache for context to use."
  [val]
  (aset js/TextMetrics "TextMetrics._context" val))

(defn text-metrics.-fonts
  "Property.

  Member of TextMetrics.

  Cache of {@see PIXI.TextMetrics.FontMetrics} objects."
  []
  (-> js/TextMetrics .-TextMetrics._fonts))

(defn set-text-metrics.-fonts!
  "Property.

  Member of TextMetrics.

  Cache of {@see PIXI.TextMetrics.FontMetrics} objects."
  [val]
  (aset js/TextMetrics "TextMetrics._fonts" val))

(defn text-metrics.-newlines
  "Property.

  Member of TextMetrics.

  Cache of new line chars."
  []
  (-> js/TextMetrics .-TextMetrics._newlines))

(defn set-text-metrics.-newlines!
  "Property.

  Member of TextMetrics.

  Cache of new line chars."
  [val]
  (aset js/TextMetrics "TextMetrics._newlines" val))

(defn font-properties
  "Property.

  Member of TextMetrics.

  The font properties object from TextMetrics.measureFont"
  [this]
  (-> this .-fontProperties))

(defn set-font-properties!
  "Property.

  Member of TextMetrics.

  The font properties object from TextMetrics.measureFont"
  [this val]
  (aset this "fontProperties" val))

(defn height
  "Property.

  Member of TextMetrics.

  The measured height of the text"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of TextMetrics.

  The measured height of the text"
  [this val]
  (aset this "height" val))

(defn line-height
  "Property.

  Member of TextMetrics.

  The measured line height for this style"
  [this]
  (-> this .-lineHeight))

(defn set-line-height!
  "Property.

  Member of TextMetrics.

  The measured line height for this style"
  [this val]
  (aset this "lineHeight" val))

(defn line-widths
  "Property.

  Member of TextMetrics.

  An array of the line widths for each line matched to `lines`"
  [this]
  (-> this .-lineWidths))

(defn set-line-widths!
  "Property.

  Member of TextMetrics.

  An array of the line widths for each line matched to `lines`"
  [this val]
  (aset this "lineWidths" val))

(defn lines
  "Property.

  Member of TextMetrics.

  An array of lines of the text broken by new lines and wrapping
  specified in style"
  [this]
  (-> this .-lines))

(defn set-lines!
  "Property.

  Member of TextMetrics.

  An array of lines of the text broken by new lines and wrapping
  specified in style"
  [this val]
  (aset this "lines" val))

(defn max-line-width
  "Property.

  Member of TextMetrics.

  The maximum line width for all measured lines"
  [this]
  (-> this .-maxLineWidth))

(defn set-max-line-width!
  "Property.

  Member of TextMetrics.

  The maximum line width for all measured lines"
  [this val]
  (aset this "maxLineWidth" val))

(defn style
  "Property.

  Member of TextMetrics.

  The style that was measured"
  [this]
  (-> this .-style))

(defn set-style!
  "Property.

  Member of TextMetrics.

  The style that was measured"
  [this val]
  (aset this "style" val))

(defn text
  "Property.

  Member of TextMetrics.

  The text that was measured"
  [this]
  (-> this .-text))

(defn set-text!
  "Property.

  Member of TextMetrics.

  The text that was measured"
  [this val]
  (aset this "text" val))

(defn width
  "Property.

  Member of TextMetrics.

  The measured width of the text"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of TextMetrics.

  The measured width of the text"
  [this val]
  (aset this "width" val))

