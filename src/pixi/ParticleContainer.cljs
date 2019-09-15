(ns pixi.ParticleContainer
  "Extends - Container.

  The ParticleContainer class is a really fast version of the Container
  solely for speed,
  so use when you need a lot of sprites or particles.
  The tradeoff of the ParticleContainer is that most advanced functionality
  not work.
  ParticleContainer implements the basic object transform (position,
  rotation)
  and some advanced functionality like tint (as of v4.5.6).
  Other more advanced functionality like masking, children, filters,
  will not work on sprites in this batch.
  It's extremely easy to use:
  ```js
  let container = new ParticleContainer();
  for (let i = 0; i < 100; ++i)
  {
  let sprite = PIXI.Sprite.from(\"myImage.png\");
  container.addChild(sprite);
  }
  ```
  And here you have a hundred sprites that will be rendered at
  speed of light."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/ParticleContainer))
  ([max-size]
    (new js/ParticleContainer max-size))
  ([max-size properties]
    (new js/ParticleContainer max-size properties))
  ([max-size properties batch-size]
    (new js/ParticleContainer max-size properties batch-size))
  ([max-size properties batch-size auto-resize]
    (new js/ParticleContainer max-size properties batch-size auto-resize)))

(defn add-child
  "Method.

  Member of ParticleContainer.

  Adds one or more children to the container.
  Multiple items can be added like so: `myContainer.addChild(thingOne,
  thingThree)`"
  ([this child]
    (-> this (.addChild child))))

(defn add-child-at
  "Method.

  Member of ParticleContainer.

  Adds a child to the container at a specified index. If the index
  out of bounds an error will be thrown"
  ([this child index]
    (-> this (.addChildAt child index))))

(defn calculate-bounds
  "Method.

  Member of ParticleContainer.

  Recalculates the bounds of the container."
  ([this]
    (-> this (.calculateBounds))))

(defn destroy
  "Method.

  Member of ParticleContainer.

  Destroys the container"
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn get-child-at
  "Method.

  Member of ParticleContainer.

  Returns the child at the specified index"
  ([this index]
    (-> this (.getChildAt index))))

(defn get-child-index
  "Method.

  Member of ParticleContainer.

  Returns the index position of a child DisplayObject instance"
  ([this child]
    (-> this (.getChildIndex child))))

(defn on-children-change
  "Method.

  Member of ParticleContainer.

  Set the flag that static data should be updated to true"
  ([this smallest-child-index]
    (-> this (.onChildrenChange smallest-child-index))))

(defn remove-child
  "Method.

  Member of ParticleContainer.

  Removes one or more children from the container."
  ([this child]
    (-> this (.removeChild child))))

(defn remove-child-at
  "Method.

  Member of ParticleContainer.

  Removes a child from the specified index position."
  ([this index]
    (-> this (.removeChildAt index))))

(defn remove-children
  "Method.

  Member of ParticleContainer.

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

  Member of ParticleContainer.

  Renders the container using the WebGL renderer"
  ([this renderer]
    (-> this (.render renderer))))

(defn render-advanced
  "Method.

  Member of ParticleContainer.

  Render the object using the WebGL renderer and advanced features."
  ([this renderer]
    (-> this (.renderAdvanced renderer))))

(defn set-child-index
  "Method.

  Member of ParticleContainer.

  Changes the position of an existing child in the display object"
  ([this child index]
    (-> this (.setChildIndex child index))))

(defn set-properties
  "Method.

  Member of ParticleContainer.

  Sets the private properties array to dynamic / static based on
  passed properties object"
  ([this properties]
    (-> this (.setProperties properties))))

(defn sort-children
  "Method.

  Member of ParticleContainer.

  Sorts children by zIndex. Previous order is mantained for 2 children
  the same zIndex."
  ([this]
    (-> this (.sortChildren))))

(defn swap-children
  "Method.

  Member of ParticleContainer.

  Swaps the position of 2 Display Objects within this container."
  ([this child child2]
    (-> this (.swapChildren child child2))))

(defn update-transform
  "Method.

  Member of ParticleContainer.

  Updates the object transform for rendering"
  ([this]
    (-> this (.updateTransform))))

(defn auto-resize
  "Property.

  Member of ParticleContainer.

  If true, container allocates more batches in case there are more
  `maxSize` particles."
  [this]
  (-> this .-autoResize))

(defn set-auto-resize!
  "Property.

  Member of ParticleContainer.

  If true, container allocates more batches in case there are more
  `maxSize` particles."
  [this val]
  (aset this "autoResize" val))

(defn base-texture
  "Property.

  Member of ParticleContainer.

  The texture used to render the children."
  [this]
  (-> this .-baseTexture))

(defn set-base-texture!
  "Property.

  Member of ParticleContainer.

  The texture used to render the children."
  [this val]
  (aset this "baseTexture" val))

(defn blend-mode
  "Property.

  Member of ParticleContainer.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of ParticleContainer.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn children
  "Property.

  Member of ParticleContainer.

  The array of children of this container."
  [this]
  (-> this .-children))

(defn set-children!
  "Property.

  Member of ParticleContainer.

  The array of children of this container."
  [this val]
  (aset this "children" val))

(defn height
  "Property.

  Member of ParticleContainer.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of ParticleContainer.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "height" val))

(defn interactive-children
  "Property.

  Member of ParticleContainer."
  [this]
  (-> this .-interactiveChildren))

(defn set-interactive-children!
  "Property.

  Member of ParticleContainer."
  [this val]
  (aset this "interactiveChildren" val))

(defn round-pixels
  "Property.

  Member of ParticleContainer.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  Default to true here as performance is usually the priority for"
  [this]
  (-> this .-roundPixels))

(defn set-round-pixels!
  "Property.

  Member of ParticleContainer.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  Default to true here as performance is usually the priority for"
  [this val]
  (aset this "roundPixels" val))

(defn sort-dirty
  "Property.

  Member of ParticleContainer.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this]
  (-> this .-sortDirty))

(defn set-sort-dirty!
  "Property.

  Member of ParticleContainer.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this val]
  (aset this "sortDirty" val))

(defn sortable-children
  "Property.

  Member of ParticleContainer.

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

  Member of ParticleContainer.

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

(defn tint
  "Property.

  Member of ParticleContainer.

  The tint applied to the container. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect.
  * IMPORTANT: This is a WebGL only feature and will be ignored
  the canvas renderer."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of ParticleContainer.

  The tint applied to the container. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect.
  * IMPORTANT: This is a WebGL only feature and will be ignored
  the canvas renderer."
  [this val]
  (aset this "tint" val))

(defn width
  "Property.

  Member of ParticleContainer.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of ParticleContainer.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "width" val))

