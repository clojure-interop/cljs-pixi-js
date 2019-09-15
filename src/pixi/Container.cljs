(ns pixi.Container
  "Extends - DisplayObject.

  A Container represents a collection of display objects.
  It is the base class of all display objects that act as a container
  other objects (like Sprites).
  ```js
  let container = new PIXI.Container();
  container.addChild(sprite);
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/Container)))

(defn add-child
  "Method.

  Member of Container.

  Adds one or more children to the container.
  Multiple items can be added like so: `myContainer.addChild(thingOne,
  thingThree)`"
  ([this child]
    (-> this (.addChild child))))

(defn add-child-at
  "Method.

  Member of Container.

  Adds a child to the container at a specified index. If the index
  out of bounds an error will be thrown"
  ([this child index]
    (-> this (.addChildAt child index))))

(defn calculate-bounds
  "Method.

  Member of Container.

  Recalculates the bounds of the container."
  ([this]
    (-> this (.calculateBounds))))

(defn destroy
  "Method.

  Member of Container.

  Removes all internal references and listeners as well as removes
  from the display list.
  Do not use a Container after calling `destroy`."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn display-object-update-transform
  "Method.

  Member of Container.

  DisplayObject default updateTransform, does not update children
  container.
  Will crash if there's no parent element."
  ([this]
    (-> this (.displayObjectUpdateTransform))))

(defn get-bounds
  "Method.

  Member of Container.

  Retrieves the bounds of the displayObject as a rectangle object."
  ([this]
    (-> this (.getBounds)))
  ([this skip-update]
    (-> this (.getBounds skip-update)))
  ([this skip-update rect]
    (-> this (.getBounds skip-update rect))))

(defn get-child-at
  "Method.

  Member of Container.

  Returns the child at the specified index"
  ([this index]
    (-> this (.getChildAt index))))

(defn get-child-index
  "Method.

  Member of Container.

  Returns the index position of a child DisplayObject instance"
  ([this child]
    (-> this (.getChildIndex child))))

(defn get-local-bounds
  "Method.

  Member of Container.

  Retrieves the local bounds of the displayObject as a rectangle"
  ([this]
    (-> this (.getLocalBounds)))
  ([this rect]
    (-> this (.getLocalBounds rect))))

(defn *mixin
  "Method.

  Member of Container.

  Mixes all enumerable properties and methods from a source object
  DisplayObject."
  ([source]
    (-> js/DisplayObject (.mixin source))))

(defn on-children-change
  "Method.

  Member of Container.

  Overridable method that can be used by Container subclasses whenever
  children array is modified"
  ([this]
    (-> this (.onChildrenChange))))

(defn remove-child
  "Method.

  Member of Container.

  Removes one or more children from the container."
  ([this child]
    (-> this (.removeChild child))))

(defn remove-child-at
  "Method.

  Member of Container.

  Removes a child from the specified index position."
  ([this index]
    (-> this (.removeChildAt index))))

(defn remove-children
  "Method.

  Member of Container.

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

  Member of Container.

  Renders the object using the WebGL renderer"
  ([this renderer]
    (-> this (.render renderer))))

(defn render-advanced
  "Method.

  Member of Container.

  Render the object using the WebGL renderer and advanced features."
  ([this renderer]
    (-> this (.renderAdvanced renderer))))

(defn set-child-index
  "Method.

  Member of Container.

  Changes the position of an existing child in the display object"
  ([this child index]
    (-> this (.setChildIndex child index))))

(defn set-parent
  "Method.

  Member of Container.

  Set the parent Container of this DisplayObject."
  ([this container]
    (-> this (.setParent container))))

(defn set-transform
  "Method.

  Member of Container.

  Convenience function to set the position, scale, skew and pivot
  once."
  ([this]
    (-> this (.setTransform)))
  ([this x]
    (-> this (.setTransform x)))
  ([this x y]
    (-> this (.setTransform x y)))
  ([this x y scale-x]
    (-> this (.setTransform x y scale-x)))
  ([this x y scale-x scale-y]
    (-> this (.setTransform x y scale-x scale-y)))
  ([this x y scale-x scale-y rotation]
    (-> this (.setTransform x y scale-x scale-y rotation)))
  ([this x y scale-x scale-y rotation skew-x]
    (-> this (.setTransform x y scale-x scale-y rotation skew-x)))
  ([this x y scale-x scale-y rotation skew-x skew-y]
    (-> this (.setTransform x y scale-x scale-y rotation skew-x skew-y)))
  ([this x y scale-x scale-y rotation skew-x skew-y pivot-x]
    (-> this (.setTransform x y scale-x scale-y rotation skew-x skew-y pivot-x)))
  ([this x y scale-x scale-y rotation skew-x skew-y pivot-x pivot-y]
    (-> this (.setTransform x y scale-x scale-y rotation skew-x skew-y pivot-x pivot-y))))

(defn sort-children
  "Method.

  Member of Container.

  Sorts children by zIndex. Previous order is mantained for 2 children
  the same zIndex."
  ([this]
    (-> this (.sortChildren))))

(defn swap-children
  "Method.

  Member of Container.

  Swaps the position of 2 Display Objects within this container."
  ([this child child2]
    (-> this (.swapChildren child child2))))

(defn to-global
  "Method.

  Member of Container.

  Calculates the global position of the display object."
  ([this position]
    (-> this (.toGlobal position)))
  ([this position point]
    (-> this (.toGlobal position point)))
  ([this position point skip-update]
    (-> this (.toGlobal position point skip-update))))

(defn to-local
  "Method.

  Member of Container.

  Calculates the local position of the display object relative
  another point."
  ([this position]
    (-> this (.toLocal position)))
  ([this position from]
    (-> this (.toLocal position from)))
  ([this position from point]
    (-> this (.toLocal position from point)))
  ([this position from point skip-update]
    (-> this (.toLocal position from point skip-update))))

(defn update-transform
  "Method.

  Member of Container.

  Updates the transform on all children of this container for rendering"
  ([this]
    (-> this (.updateTransform))))

(defn alpha
  "Property.

  Member of Container.

  The opacity of the object."
  [this]
  (-> this .-alpha))

(defn set-alpha!
  "Property.

  Member of Container.

  The opacity of the object."
  [this val]
  (aset this "alpha" val))

(defn angle
  "Property.

  Member of Container.

  The angle of the object in degrees.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this]
  (-> this .-angle))

(defn set-angle!
  "Property.

  Member of Container.

  The angle of the object in degrees.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this val]
  (aset this "angle" val))

(defn children
  "Property.

  Member of Container.

  The array of children of this container."
  [this]
  (-> this .-children))

(defn set-children!
  "Property.

  Member of Container.

  The array of children of this container."
  [this val]
  (aset this "children" val))

(defn filter-area
  "Property.

  Member of Container.

  The area the filter is applied to. This is used as more of an
  rather than figuring out the dimensions of the displayObject
  frame you can set this rectangle.
  Also works as an interaction mask."
  [this]
  (-> this .-filterArea))

(defn set-filter-area!
  "Property.

  Member of Container.

  The area the filter is applied to. This is used as more of an
  rather than figuring out the dimensions of the displayObject
  frame you can set this rectangle.
  Also works as an interaction mask."
  [this val]
  (aset this "filterArea" val))

(defn filters
  "Property.

  Member of Container.

  Sets the filters for the displayObject.
  * IMPORTANT: This is a WebGL only feature and will be ignored
  the canvas renderer.
  To remove filters simply set this property to `'null'`."
  [this]
  (-> this .-filters))

(defn set-filters!
  "Property.

  Member of Container.

  Sets the filters for the displayObject.
  * IMPORTANT: This is a WebGL only feature and will be ignored
  the canvas renderer.
  To remove filters simply set this property to `'null'`."
  [this val]
  (aset this "filters" val))

(defn height
  "Property.

  Member of Container.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Container.

  The height of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "height" val))

(defn is-sprite
  "Property.

  Member of Container.

  used to fast check if a sprite is.. a sprite!"
  [this]
  (-> this .-isSprite))

(defn set-is-sprite!
  "Property.

  Member of Container.

  used to fast check if a sprite is.. a sprite!"
  [this val]
  (aset this "isSprite" val))

(defn local-transform
  "Property.

  Member of Container.

  Current transform of the object based on local factors: position,
  other stuff."
  [this]
  (-> this .-localTransform))

(defn set-local-transform!
  "Property.

  Member of Container.

  Current transform of the object based on local factors: position,
  other stuff."
  [this val]
  (aset this "localTransform" val))

(defn mask
  "Property.

  Member of Container.

  Sets a mask for the displayObject. A mask is an object that limits
  visibility of an
  object to the shape of the mask applied to it. In PixiJS a regular
  must be a
  {@link PIXI.Graphics} or a {@link PIXI.Sprite} object. This allows
  much faster masking in canvas as it
  utilities shape clipping. To remove a mask, set this property
  `null`.
  For sprite mask both alpha and red channel are used. Black mask
  the same as transparent mask."
  [this]
  (-> this .-mask))

(defn set-mask!
  "Property.

  Member of Container.

  Sets a mask for the displayObject. A mask is an object that limits
  visibility of an
  object to the shape of the mask applied to it. In PixiJS a regular
  must be a
  {@link PIXI.Graphics} or a {@link PIXI.Sprite} object. This allows
  much faster masking in canvas as it
  utilities shape clipping. To remove a mask, set this property
  `null`.
  For sprite mask both alpha and red channel are used. Black mask
  the same as transparent mask."
  [this val]
  (aset this "mask" val))

(defn parent
  "Property.

  Member of Container.

  The display object container that contains this display object."
  [this]
  (-> this .-parent))

(defn set-parent!
  "Property.

  Member of Container.

  The display object container that contains this display object."
  [this val]
  (aset this "parent" val))

(defn pivot
  "Property.

  Member of Container.

  The pivot point of the displayObject that it rotates around.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-pivot))

(defn set-pivot!
  "Property.

  Member of Container.

  The pivot point of the displayObject that it rotates around.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "pivot" val))

(defn position
  "Property.

  Member of Container.

  The coordinate of the object relative to the local coordinates
  the parent.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-position))

(defn set-position!
  "Property.

  Member of Container.

  The coordinate of the object relative to the local coordinates
  the parent.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "position" val))

(defn renderable
  "Property.

  Member of Container.

  Can this object be rendered, if false the object will not be
  but the updateTransform
  methods will still be called.
  Only affects recursive calls from parent. You can ask for bounds"
  [this]
  (-> this .-renderable))

(defn set-renderable!
  "Property.

  Member of Container.

  Can this object be rendered, if false the object will not be
  but the updateTransform
  methods will still be called.
  Only affects recursive calls from parent. You can ask for bounds"
  [this val]
  (aset this "renderable" val))

(defn rotation
  "Property.

  Member of Container.

  The rotation of the object in radians.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this]
  (-> this .-rotation))

(defn set-rotation!
  "Property.

  Member of Container.

  The rotation of the object in radians.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this val]
  (aset this "rotation" val))

(defn scale
  "Property.

  Member of Container.

  The scale factor of the object.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-scale))

(defn set-scale!
  "Property.

  Member of Container.

  The scale factor of the object.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "scale" val))

(defn skew
  "Property.

  Member of Container.

  The skew factor for the object in radians.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-skew))

(defn set-skew!
  "Property.

  Member of Container.

  The skew factor for the object in radians.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "skew" val))

(defn sort-dirty
  "Property.

  Member of Container.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this]
  (-> this .-sortDirty))

(defn set-sort-dirty!
  "Property.

  Member of Container.

  Should children be sorted by zIndex at the next updateTransform
  Will get automatically set to true if a new child is added, or
  a child's zIndex changes."
  [this val]
  (aset this "sortDirty" val))

(defn sortable-children
  "Property.

  Member of Container.

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

  Member of Container.

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

(defn transform
  "Property.

  Member of Container.

  World transform and local transform of this object.
  This will become read-only later, please do not assign anything
  unless you know what are you doing."
  [this]
  (-> this .-transform))

(defn set-transform!
  "Property.

  Member of Container.

  World transform and local transform of this object.
  This will become read-only later, please do not assign anything
  unless you know what are you doing."
  [this val]
  (aset this "transform" val))

(defn visible
  "Property.

  Member of Container.

  The visibility of the object. If false the object will not be
  and
  the updateTransform function will not be called.
  Only affects recursive calls from parent. You can ask for bounds
  call updateTransform manually."
  [this]
  (-> this .-visible))

(defn set-visible!
  "Property.

  Member of Container.

  The visibility of the object. If false the object will not be
  and
  the updateTransform function will not be called.
  Only affects recursive calls from parent. You can ask for bounds
  call updateTransform manually."
  [this val]
  (aset this "visible" val))

(defn width
  "Property.

  Member of Container.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Container.

  The width of the Container, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "width" val))

(defn world-alpha
  "Property.

  Member of Container.

  The multiplied alpha of the displayObject."
  [this]
  (-> this .-worldAlpha))

(defn set-world-alpha!
  "Property.

  Member of Container.

  The multiplied alpha of the displayObject."
  [this val]
  (aset this "worldAlpha" val))

(defn world-transform
  "Property.

  Member of Container.

  Current transform of the object based on world (parent) factors."
  [this]
  (-> this .-worldTransform))

(defn set-world-transform!
  "Property.

  Member of Container.

  Current transform of the object based on world (parent) factors."
  [this val]
  (aset this "worldTransform" val))

(defn world-visible
  "Property.

  Member of Container.

  Indicates if the object is globally visible."
  [this]
  (-> this .-worldVisible))

(defn set-world-visible!
  "Property.

  Member of Container.

  Indicates if the object is globally visible."
  [this val]
  (aset this "worldVisible" val))

(defn x
  "Property.

  Member of Container.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent.
  An alias to position.x"
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of Container.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent.
  An alias to position.x"
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of Container.

  The position of the displayObject on the y axis relative to the
  coordinates of the parent.
  An alias to position.y"
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of Container.

  The position of the displayObject on the y axis relative to the
  coordinates of the parent.
  An alias to position.y"
  [this val]
  (aset this "y" val))

(defn z-index
  "Property.

  Member of Container.

  The zIndex of the displayObject.
  If a container has the sortableChildren property set to true,
  will be automatically
  sorted by zIndex value; a higher value will mean it will be moved
  the end of the array,
  and thus rendered on top of other displayObjects within the same"
  [this]
  (-> this .-zIndex))

(defn set-z-index!
  "Property.

  Member of Container.

  The zIndex of the displayObject.
  If a container has the sortableChildren property set to true,
  will be automatically
  sorted by zIndex value; a higher value will mean it will be moved
  the end of the array,
  and thus rendered on top of other displayObjects within the same"
  [this val]
  (aset this "zIndex" val))

