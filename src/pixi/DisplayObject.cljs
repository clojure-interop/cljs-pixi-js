(ns pixi.DisplayObject
  "Extends - EventEmitter.

  The base class for all objects that are rendered on the screen.
  This is an abstract class and should not be used on its own;
  it should be extended."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/DisplayObject)))

(defn destroy
  "Method.

  Member of DisplayObject.

  Base destroy method for generic display objects. This will automatically
  remove the display object from its parent Container as well as
  all current event listeners and internal references. Do not use
  DisplayObject
  after calling `destroy()`."
  ([this]
    (-> this (.destroy))))

(defn display-object-update-transform
  "Method.

  Member of DisplayObject.

  DisplayObject default updateTransform, does not update children
  container.
  Will crash if there's no parent element."
  ([this]
    (-> this (.displayObjectUpdateTransform))))

(defn get-bounds
  "Method.

  Member of DisplayObject.

  Retrieves the bounds of the displayObject as a rectangle object."
  ([this]
    (-> this (.getBounds)))
  ([this skip-update]
    (-> this (.getBounds skip-update)))
  ([this skip-update rect]
    (-> this (.getBounds skip-update rect))))

(defn get-local-bounds
  "Method.

  Member of DisplayObject.

  Retrieves the local bounds of the displayObject as a rectangle"
  ([this]
    (-> this (.getLocalBounds)))
  ([this rect]
    (-> this (.getLocalBounds rect))))

(defn *mixin
  "Method.

  Member of DisplayObject.

  Mixes all enumerable properties and methods from a source object
  DisplayObject."
  ([source]
    (-> js/DisplayObject (.mixin source))))

(defn render
  "Method.

  Member of DisplayObject.

  Renders the object using the WebGL renderer."
  ([this renderer]
    (-> this (.render renderer))))

(defn set-parent
  "Method.

  Member of DisplayObject.

  Set the parent Container of this DisplayObject."
  ([this container]
    (-> this (.setParent container))))

(defn set-transform
  "Method.

  Member of DisplayObject.

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

(defn to-global
  "Method.

  Member of DisplayObject.

  Calculates the global position of the display object."
  ([this position]
    (-> this (.toGlobal position)))
  ([this position point]
    (-> this (.toGlobal position point)))
  ([this position point skip-update]
    (-> this (.toGlobal position point skip-update))))

(defn to-local
  "Method.

  Member of DisplayObject.

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

  Member of DisplayObject.

  Updates the object transform for rendering.
  TODO - Optimization pass!"
  ([this]
    (-> this (.updateTransform))))

(defn alpha
  "Property.

  Member of DisplayObject.

  The opacity of the object."
  [this]
  (-> this .-alpha))

(defn set-alpha!
  "Property.

  Member of DisplayObject.

  The opacity of the object."
  [this val]
  (aset this "alpha" val))

(defn angle
  "Property.

  Member of DisplayObject.

  The angle of the object in degrees.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this]
  (-> this .-angle))

(defn set-angle!
  "Property.

  Member of DisplayObject.

  The angle of the object in degrees.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this val]
  (aset this "angle" val))

(defn filter-area
  "Property.

  Member of DisplayObject.

  The area the filter is applied to. This is used as more of an
  rather than figuring out the dimensions of the displayObject
  frame you can set this rectangle.
  Also works as an interaction mask."
  [this]
  (-> this .-filterArea))

(defn set-filter-area!
  "Property.

  Member of DisplayObject.

  The area the filter is applied to. This is used as more of an
  rather than figuring out the dimensions of the displayObject
  frame you can set this rectangle.
  Also works as an interaction mask."
  [this val]
  (aset this "filterArea" val))

(defn filters
  "Property.

  Member of DisplayObject.

  Sets the filters for the displayObject.
  * IMPORTANT: This is a WebGL only feature and will be ignored
  the canvas renderer.
  To remove filters simply set this property to `'null'`."
  [this]
  (-> this .-filters))

(defn set-filters!
  "Property.

  Member of DisplayObject.

  Sets the filters for the displayObject.
  * IMPORTANT: This is a WebGL only feature and will be ignored
  the canvas renderer.
  To remove filters simply set this property to `'null'`."
  [this val]
  (aset this "filters" val))

(defn is-sprite
  "Property.

  Member of DisplayObject.

  used to fast check if a sprite is.. a sprite!"
  [this]
  (-> this .-isSprite))

(defn set-is-sprite!
  "Property.

  Member of DisplayObject.

  used to fast check if a sprite is.. a sprite!"
  [this val]
  (aset this "isSprite" val))

(defn local-transform
  "Property.

  Member of DisplayObject.

  Current transform of the object based on local factors: position,
  other stuff."
  [this]
  (-> this .-localTransform))

(defn set-local-transform!
  "Property.

  Member of DisplayObject.

  Current transform of the object based on local factors: position,
  other stuff."
  [this val]
  (aset this "localTransform" val))

(defn mask
  "Property.

  Member of DisplayObject.

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

  Member of DisplayObject.

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

  Member of DisplayObject.

  The display object container that contains this display object."
  [this]
  (-> this .-parent))

(defn set-parent!
  "Property.

  Member of DisplayObject.

  The display object container that contains this display object."
  [this val]
  (aset this "parent" val))

(defn pivot
  "Property.

  Member of DisplayObject.

  The pivot point of the displayObject that it rotates around.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-pivot))

(defn set-pivot!
  "Property.

  Member of DisplayObject.

  The pivot point of the displayObject that it rotates around.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "pivot" val))

(defn position
  "Property.

  Member of DisplayObject.

  The coordinate of the object relative to the local coordinates
  the parent.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-position))

(defn set-position!
  "Property.

  Member of DisplayObject.

  The coordinate of the object relative to the local coordinates
  the parent.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "position" val))

(defn renderable
  "Property.

  Member of DisplayObject.

  Can this object be rendered, if false the object will not be
  but the updateTransform
  methods will still be called.
  Only affects recursive calls from parent. You can ask for bounds"
  [this]
  (-> this .-renderable))

(defn set-renderable!
  "Property.

  Member of DisplayObject.

  Can this object be rendered, if false the object will not be
  but the updateTransform
  methods will still be called.
  Only affects recursive calls from parent. You can ask for bounds"
  [this val]
  (aset this "renderable" val))

(defn rotation
  "Property.

  Member of DisplayObject.

  The rotation of the object in radians.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this]
  (-> this .-rotation))

(defn set-rotation!
  "Property.

  Member of DisplayObject.

  The rotation of the object in radians.
  'rotation' and 'angle' have the same effect on a display object;
  is in radians, angle is in degrees."
  [this val]
  (aset this "rotation" val))

(defn scale
  "Property.

  Member of DisplayObject.

  The scale factor of the object.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-scale))

(defn set-scale!
  "Property.

  Member of DisplayObject.

  The scale factor of the object.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "scale" val))

(defn skew
  "Property.

  Member of DisplayObject.

  The skew factor for the object in radians.
  Assignment by value since pixi-v4."
  [this]
  (-> this .-skew))

(defn set-skew!
  "Property.

  Member of DisplayObject.

  The skew factor for the object in radians.
  Assignment by value since pixi-v4."
  [this val]
  (aset this "skew" val))

(defn transform
  "Property.

  Member of DisplayObject.

  World transform and local transform of this object.
  This will become read-only later, please do not assign anything
  unless you know what are you doing."
  [this]
  (-> this .-transform))

(defn set-transform!
  "Property.

  Member of DisplayObject.

  World transform and local transform of this object.
  This will become read-only later, please do not assign anything
  unless you know what are you doing."
  [this val]
  (aset this "transform" val))

(defn visible
  "Property.

  Member of DisplayObject.

  The visibility of the object. If false the object will not be
  and
  the updateTransform function will not be called.
  Only affects recursive calls from parent. You can ask for bounds
  call updateTransform manually."
  [this]
  (-> this .-visible))

(defn set-visible!
  "Property.

  Member of DisplayObject.

  The visibility of the object. If false the object will not be
  and
  the updateTransform function will not be called.
  Only affects recursive calls from parent. You can ask for bounds
  call updateTransform manually."
  [this val]
  (aset this "visible" val))

(defn world-alpha
  "Property.

  Member of DisplayObject.

  The multiplied alpha of the displayObject."
  [this]
  (-> this .-worldAlpha))

(defn set-world-alpha!
  "Property.

  Member of DisplayObject.

  The multiplied alpha of the displayObject."
  [this val]
  (aset this "worldAlpha" val))

(defn world-transform
  "Property.

  Member of DisplayObject.

  Current transform of the object based on world (parent) factors."
  [this]
  (-> this .-worldTransform))

(defn set-world-transform!
  "Property.

  Member of DisplayObject.

  Current transform of the object based on world (parent) factors."
  [this val]
  (aset this "worldTransform" val))

(defn world-visible
  "Property.

  Member of DisplayObject.

  Indicates if the object is globally visible."
  [this]
  (-> this .-worldVisible))

(defn set-world-visible!
  "Property.

  Member of DisplayObject.

  Indicates if the object is globally visible."
  [this val]
  (aset this "worldVisible" val))

(defn x
  "Property.

  Member of DisplayObject.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent.
  An alias to position.x"
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of DisplayObject.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent.
  An alias to position.x"
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of DisplayObject.

  The position of the displayObject on the y axis relative to the
  coordinates of the parent.
  An alias to position.y"
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of DisplayObject.

  The position of the displayObject on the y axis relative to the
  coordinates of the parent.
  An alias to position.y"
  [this val]
  (aset this "y" val))

(defn z-index
  "Property.

  Member of DisplayObject.

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

  Member of DisplayObject.

  The zIndex of the displayObject.
  If a container has the sortableChildren property set to true,
  will be automatically
  sorted by zIndex value; a higher value will mean it will be moved
  the end of the array,
  and thus rendered on top of other displayObjects within the same"
  [this val]
  (aset this "zIndex" val))

