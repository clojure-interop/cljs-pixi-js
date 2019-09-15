(ns pixi.Sprite
  "Extends - Container.

  The Sprite object is the base for all textured objects that are
  to the screen
  A sprite can be created directly from an image like this:
  ```js
  let sprite = PIXI.Sprite.from('assets/image.png');
  ```
  The more efficient way to create sprites is using a {@link PIXI.Spritesheet},
  as swapping base textures when rendering to the screen is inefficient.
  ```js
  PIXI.Loader.shared.add(\"assets/spritesheet.json\").load(setup);
  function setup() {
  let sheet = PIXI.Loader.shared.resources[\"assets/spritesheet.json\"].spritesheet;
  let sprite = new PIXI.Sprite(sheet.textures[\"image.png\"]);
  ...
  }
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/Sprite))
  ([texture]
    (new js/Sprite texture)))

(defn add-child
  "Method.

  Member of Sprite.

  Adds one or more children to the container.
  Multiple items can be added like so: `myContainer.addChild(thingOne,
  thingThree)`"
  ([this child]
    (-> this (.addChild child))))

(defn add-child-at
  "Method.

  Member of Sprite.

  Adds a child to the container at a specified index. If the index
  out of bounds an error will be thrown"
  ([this child index]
    (-> this (.addChildAt child index))))

(defn calculate-bounds
  "Method.

  Member of Sprite.

  Recalculates the bounds of the container."
  ([this]
    (-> this (.calculateBounds))))

(defn calculate-trimmed-vertices
  "Method.

  Member of Sprite.

  calculates worldTransform * vertices for a non texture with a
  store it in vertexTrimmedData
  This is used to ensure that the true width and height of a trimmed
  is respected"
  ([this]
    (-> this (.calculateTrimmedVertices))))

(defn calculate-vertices
  "Method.

  Member of Sprite.

  calculates worldTransform * vertices, store it in vertexData"
  ([this]
    (-> this (.calculateVertices))))

(defn contains-point
  "Method.

  Member of Sprite.

  Tests if a point is inside this sprite"
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of Sprite.

  Destroys this sprite and optionally its texture and children"
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn *from
  "Method.

  Member of Sprite.

  Helper function that creates a new sprite based on the source
  provide.
  The source can be - frame id, image url, video url, canvas element,
  element, base texture"
  ([source]
    (-> js/Sprite (.from source)))
  ([source options]
    (-> js/Sprite (.from source options))))

(defn get-child-at
  "Method.

  Member of Sprite.

  Returns the child at the specified index"
  ([this index]
    (-> this (.getChildAt index))))

(defn get-child-index
  "Method.

  Member of Sprite.

  Returns the index position of a child DisplayObject instance"
  ([this child]
    (-> this (.getChildIndex child))))

(defn get-local-bounds
  "Method.

  Member of Sprite.

  Gets the local bounds of the sprite object."
  ([this]
    (-> this (.getLocalBounds)))
  ([this rect]
    (-> this (.getLocalBounds rect))))

(defn on-children-change
  "Method.

  Member of Sprite.

  Overridable method that can be used by Container subclasses whenever
  children array is modified"
  ([this]
    (-> this (.onChildrenChange))))

(defn remove-child
  "Method.

  Member of Sprite.

  Removes one or more children from the container."
  ([this child]
    (-> this (.removeChild child))))

(defn remove-child-at
  "Method.

  Member of Sprite.

  Removes a child from the specified index position."
  ([this index]
    (-> this (.removeChildAt index))))

(defn remove-children
  "Method.

  Member of Sprite.

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

  Member of Sprite.

  Renders the object using the WebGL renderer"
  ([this renderer]
    (-> this (.render renderer))))

(defn render-advanced
  "Method.

  Member of Sprite.

  Render the object using the WebGL renderer and advanced features."
  ([this renderer]
    (-> this (.renderAdvanced renderer))))

(defn set-child-index
  "Method.

  Member of Sprite.

  Changes the position of an existing child in the display object"
  ([this child index]
    (-> this (.setChildIndex child index))))

(defn sort-children
  "Method.

  Member of Sprite.

  Sorts children by zIndex. Previous order is mantained for 2 children
  the same zIndex."
  ([this]
    (-> this (.sortChildren))))

(defn swap-children
  "Method.

  Member of Sprite.

  Swaps the position of 2 Display Objects within this container."
  ([this child child2]
    (-> this (.swapChildren child child2))))

(defn update-transform
  "Method.

  Member of Sprite.

  Updates the transform on all children of this container for rendering"
  ([this]
    (-> this (.updateTransform))))

(defn anchor
  "Property.

  Member of Sprite.

  The anchor sets the origin point of the text. The default value
  taken from the {@link PIXI.Texture|Texture}
  and passed to the constructor.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner.
  If you pass only single parameter, it will set both x and y to
  same value as shown in the example below."
  [this]
  (-> this .-anchor))

(defn set-anchor!
  "Property.

  Member of Sprite.

  The anchor sets the origin point of the text. The default value
  taken from the {@link PIXI.Texture|Texture}
  and passed to the constructor.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner.
  If you pass only single parameter, it will set both x and y to
  same value as shown in the example below."
  [this val]
  (aset this "anchor" val))

(defn blend-mode
  "Property.

  Member of Sprite.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of Sprite.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn children
  "Property.

  Member of Sprite.

  The array of children of this container."
  [this]
  (-> this .-children))

(defn set-children!
  "Property.

  Member of Sprite.

  The array of children of this container."
  [this val]
  (aset this "children" val))

(defn height
  "Property.

  Member of Sprite.

  The height of the sprite, setting this will actually modify the
  to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Sprite.

  The height of the sprite, setting this will actually modify the
  to achieve the value set"
  [this val]
  (aset this "height" val))

(defn is-sprite
  "Property.

  Member of Sprite.

  used to fast check if a sprite is.. a sprite!"
  [this]
  (-> this .-isSprite))

(defn set-is-sprite!
  "Property.

  Member of Sprite.

  used to fast check if a sprite is.. a sprite!"
  [this val]
  (aset this "isSprite" val))

(defn plugin-name
  "Property.

  Member of Sprite.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  & '_renderCanvas' methods."
  [this]
  (-> this .-pluginName))

(defn set-plugin-name!
  "Property.

  Member of Sprite.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  & '_renderCanvas' methods."
  [this val]
  (aset this "pluginName" val))

(defn round-pixels
  "Property.

  Member of Sprite.

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

  Member of Sprite.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this val]
  (aset this "roundPixels" val))

(defn shader
  "Property.

  Member of Sprite.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of Sprite.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this val]
  (aset this "shader" val))

(defn sort-dirty
  "Property.

  Member of Sprite.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this]
  (-> this .-sortDirty))

(defn set-sort-dirty!
  "Property.

  Member of Sprite.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this val]
  (aset this "sortDirty" val))

(defn sortable-children
  "Property.

  Member of Sprite.

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

  Member of Sprite.

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

(defn texture
  "Property.

  Member of Sprite.

  The texture that the sprite is using"
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of Sprite.

  The texture that the sprite is using"
  [this val]
  (aset this "texture" val))

(defn tint
  "Property.

  Member of Sprite.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of Sprite.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this val]
  (aset this "tint" val))

(defn vertex-data
  "Property.

  Member of Sprite.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this]
  (-> this .-vertexData))

(defn set-vertex-data!
  "Property.

  Member of Sprite.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this val]
  (aset this "vertexData" val))

(defn vertex-trimmed-data
  "Property.

  Member of Sprite.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this]
  (-> this .-vertexTrimmedData))

(defn set-vertex-trimmed-data!
  "Property.

  Member of Sprite.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this val]
  (aset this "vertexTrimmedData" val))

(defn width
  "Property.

  Member of Sprite.

  The width of the sprite, setting this will actually modify the
  to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Sprite.

  The width of the sprite, setting this will actually modify the
  to achieve the value set"
  [this val]
  (aset this "width" val))

