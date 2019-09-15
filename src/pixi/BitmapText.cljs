(ns pixi.BitmapText
  "Extends - Container.

  A BitmapText object will create a line or multiple lines of text
  bitmap font.
  The primary advantage of this class over Text is that all of
  textures are pre-generated and loading,
  meaning that rendering is fast, and changing text has no performance
  The primary disadvantage is that you need to preload the bitmap
  assets, and thus the styling is set in stone.
  Supporting character sets other than latin, such as CJK languages,
  be impractical due to the number of characters.
  To split a line you can use '\\n', '\\r' or '\\r\\n' in your string.
  You can generate the fnt files using
  http://www.angelcode.com/products/bmfont/ for Windows or
  http://www.bmglyph.com/ for Mac.
  A BitmapText can only be created when the font is loaded.
  ```js
  // in this case the font is in a file called 'desyrel.fnt'
  let bitmapText = new PIXI.BitmapText(\"text using a fancy font!\",
  \"35px Desyrel\", align: \"right\"});
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([text style]
    (new js/BitmapText text style)))

(defn add-child
  "Method.

  Member of BitmapText.

  Adds one or more children to the container.
  Multiple items can be added like so: `myContainer.addChild(thingOne,
  thingThree)`"
  ([this child]
    (-> this (.addChild child))))

(defn add-child-at
  "Method.

  Member of BitmapText.

  Adds a child to the container at a specified index. If the index
  out of bounds an error will be thrown"
  ([this child index]
    (-> this (.addChildAt child index))))

(defn calculate-bounds
  "Method.

  Member of BitmapText.

  Recalculates the bounds of the container."
  ([this]
    (-> this (.calculateBounds))))

(defn destroy
  "Method.

  Member of BitmapText.

  Removes all internal references and listeners as well as removes
  from the display list.
  Do not use a Container after calling `destroy`."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn get-child-at
  "Method.

  Member of BitmapText.

  Returns the child at the specified index"
  ([this index]
    (-> this (.getChildAt index))))

(defn get-child-index
  "Method.

  Member of BitmapText.

  Returns the index position of a child DisplayObject instance"
  ([this child]
    (-> this (.getChildIndex child))))

(defn get-local-bounds
  "Method.

  Member of BitmapText.

  Validates text before calling parent's getLocalBounds"
  ([this]
    (-> this (.getLocalBounds))))

(defn on-children-change
  "Method.

  Member of BitmapText.

  Overridable method that can be used by Container subclasses whenever
  children array is modified"
  ([this]
    (-> this (.onChildrenChange))))

(defn *register-font
  "Method.

  Member of BitmapText.

  Register a bitmap font with data and a texture."
  ([xml textures]
    (-> js/BitmapText (.registerFont xml textures))))

(defn remove-child
  "Method.

  Member of BitmapText.

  Removes one or more children from the container."
  ([this child]
    (-> this (.removeChild child))))

(defn remove-child-at
  "Method.

  Member of BitmapText.

  Removes a child from the specified index position."
  ([this index]
    (-> this (.removeChildAt index))))

(defn remove-children
  "Method.

  Member of BitmapText.

  Removes all children from this container that are within the
  and end indexes."
  ([this]
    (-> this (.removeChildren)))
  ([this begin-index]
    (-> this (.removeChildren begin-index)))
  ([this begin-index end-index]
    (-> this (.removeChildren begin-index end-index))))

(defn render
  "Method.

  Member of BitmapText.

  Renders the object using the WebGL renderer"
  ([this renderer]
    (-> this (.render renderer))))

(defn render-advanced
  "Method.

  Member of BitmapText.

  Render the object using the WebGL renderer and advanced features."
  ([this renderer]
    (-> this (.renderAdvanced renderer))))

(defn set-child-index
  "Method.

  Member of BitmapText.

  Changes the position of an existing child in the display object"
  ([this child index]
    (-> this (.setChildIndex child index))))

(defn sort-children
  "Method.

  Member of BitmapText.

  Sorts children by zIndex. Previous order is mantained for 2 children
  the same zIndex."
  ([this]
    (-> this (.sortChildren))))

(defn swap-children
  "Method.

  Member of BitmapText.

  Swaps the position of 2 Display Objects within this container."
  ([this child child2]
    (-> this (.swapChildren child child2))))

(defn update-text
  "Method.

  Member of BitmapText.

  Renders text and updates it when needed"
  ([this]
    (-> this (.updateText))))

(defn update-transform
  "Method.

  Member of BitmapText.

  Updates the transform of this object"
  ([this]
    (-> this (.updateTransform))))

(defn validate
  "Method.

  Member of BitmapText.

  Updates text when needed"
  ([this]
    (-> this (.validate))))

(defn align
  "Property.

  Member of BitmapText.

  The alignment of the BitmapText object."
  [this]
  (-> this .-align))

(defn set-align!
  "Property.

  Member of BitmapText.

  The alignment of the BitmapText object."
  [this val]
  (aset this "align" val))

(defn anchor
  "Property.

  Member of BitmapText.

  The anchor sets the origin point of the text.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner."
  [this]
  (-> this .-anchor))

(defn set-anchor!
  "Property.

  Member of BitmapText.

  The anchor sets the origin point of the text.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner."
  [this val]
  (aset this "anchor" val))

(defn children
  "Property.

  Member of BitmapText.

  The array of children of this container."
  [this]
  (-> this .-children))

(defn set-children!
  "Property.

  Member of BitmapText.

  The array of children of this container."
  [this val]
  (aset this "children" val))

(defn dirty
  "Property.

  Member of BitmapText.

  The dirty state of this object."
  [this]
  (-> this .-dirty))

(defn set-dirty!
  "Property.

  Member of BitmapText.

  The dirty state of this object."
  [this val]
  (aset this "dirty" val))

(defn font
  "Property.

  Member of BitmapText.

  Private tracker for the current font."
  [this]
  (-> this .-font))

(defn set-font!
  "Property.

  Member of BitmapText.

  Private tracker for the current font."
  [this val]
  (aset this "font" val))

(defn height
  "Property.

  Member of BitmapText.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of BitmapText.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "height" val))

(defn letter-spacing
  "Property.

  Member of BitmapText.

  Additional space between characters."
  [this]
  (-> this .-letterSpacing))

(defn set-letter-spacing!
  "Property.

  Member of BitmapText.

  Additional space between characters."
  [this val]
  (aset this "letterSpacing" val))

(defn max-line-height
  "Property.

  Member of BitmapText.

  The max line height. This is useful when trying to use the total
  of the Text,
  i.e. when trying to vertically align."
  [this]
  (-> this .-maxLineHeight))

(defn set-max-line-height!
  "Property.

  Member of BitmapText.

  The max line height. This is useful when trying to use the total
  of the Text,
  i.e. when trying to vertically align."
  [this val]
  (aset this "maxLineHeight" val))

(defn max-width
  "Property.

  Member of BitmapText.

  The max width of this bitmap text in pixels. If the text provided
  longer than the
  value provided, line breaks will be automatically inserted in
  last whitespace.
  Disable by setting the value to 0."
  [this]
  (-> this .-maxWidth))

(defn set-max-width!
  "Property.

  Member of BitmapText.

  The max width of this bitmap text in pixels. If the text provided
  longer than the
  value provided, line breaks will be automatically inserted in
  last whitespace.
  Disable by setting the value to 0."
  [this val]
  (aset this "maxWidth" val))

(defn round-pixels
  "Property.

  Member of BitmapText.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this]
  (-> this .-roundPixels))

(defn set-round-pixels!
  "Property.

  Member of BitmapText.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this val]
  (aset this "roundPixels" val))

(defn sort-dirty
  "Property.

  Member of BitmapText.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this]
  (-> this .-sortDirty))

(defn set-sort-dirty!
  "Property.

  Member of BitmapText.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this val]
  (aset this "sortDirty" val))

(defn sortable-children
  "Property.

  Member of BitmapText.

  If set to true, the container will sort its children by zIndex
  when updateTransform() is called, or manually if sortChildren()
  called.
  This actually changes the order of elements in the array, so
  be treated
  as a basic solution that is not performant compared to other
  such as @link https://github.com/pixijs/pixi-display
  Also be aware of that this may not work nicely with the addChildAt()
  as the zIndex sorting may cause the child to automatically sorted
  another position."
  [this]
  (-> this .-sortableChildren))

(defn set-sortable-children!
  "Property.

  Member of BitmapText.

  If set to true, the container will sort its children by zIndex
  when updateTransform() is called, or manually if sortChildren()
  called.
  This actually changes the order of elements in the array, so
  be treated
  as a basic solution that is not performant compared to other
  such as @link https://github.com/pixijs/pixi-display
  Also be aware of that this may not work nicely with the addChildAt()
  as the zIndex sorting may cause the child to automatically sorted
  another position."
  [this val]
  (aset this "sortableChildren" val))

(defn text
  "Property.

  Member of BitmapText.

  The text of the BitmapText object."
  [this]
  (-> this .-text))

(defn set-text!
  "Property.

  Member of BitmapText.

  The text of the BitmapText object."
  [this val]
  (aset this "text" val))

(defn text-height
  "Property.

  Member of BitmapText.

  The height of the overall text, different from fontSize,
  which is defined in the style object."
  [this]
  (-> this .-textHeight))

(defn set-text-height!
  "Property.

  Member of BitmapText.

  The height of the overall text, different from fontSize,
  which is defined in the style object."
  [this val]
  (aset this "textHeight" val))

(defn text-width
  "Property.

  Member of BitmapText.

  The width of the overall text, different from fontSize,
  which is defined in the style object."
  [this]
  (-> this .-textWidth))

(defn set-text-width!
  "Property.

  Member of BitmapText.

  The width of the overall text, different from fontSize,
  which is defined in the style object."
  [this val]
  (aset this "textWidth" val))

(defn tint
  "Property.

  Member of BitmapText.

  The tint of the BitmapText object."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of BitmapText.

  The tint of the BitmapText object."
  [this val]
  (aset this "tint" val))

(defn width
  "Property.

  Member of BitmapText.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of BitmapText.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "width" val))

