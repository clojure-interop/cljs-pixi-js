(ns pixi.core.State
  "This is a WebGL state, and is is passed The WebGL StateManager.
  Each mesh rendered may require WebGL to be in a different state.
  For example you may want different blend mode or to enable polygon"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/State)))

(defn blend
  "Property.

  Member of State.

  Activates blending of the computed fragment color values"
  [this]
  (-> this .-blend))

(defn set-blend!
  "Property.

  Member of State.

  Activates blending of the computed fragment color values"
  [this val]
  (aset this "blend" val))

(defn blend-mode
  "Property.

  Member of State.

  The blend mode to be applied when this state is set. Apply a
  of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
  Setting this mode to anything other than NO_BLEND will automatically
  blending on."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of State.

  The blend mode to be applied when this state is set. Apply a
  of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
  Setting this mode to anything other than NO_BLEND will automatically
  blending on."
  [this val]
  (aset this "blendMode" val))

(defn clockwise-front-face
  "Property.

  Member of State.

  Specifies whether or not front or back-facing polygons can be"
  [this]
  (-> this .-clockwiseFrontFace))

(defn set-clockwise-front-face!
  "Property.

  Member of State.

  Specifies whether or not front or back-facing polygons can be"
  [this val]
  (aset this "clockwiseFrontFace" val))

(defn culling
  "Property.

  Member of State.

  Activates culling of polygons."
  [this]
  (-> this .-culling))

(defn set-culling!
  "Property.

  Member of State.

  Activates culling of polygons."
  [this val]
  (aset this "culling" val))

(defn depth-test
  "Property.

  Member of State.

  Activates depth comparisons and updates to the depth buffer."
  [this]
  (-> this .-depthTest))

(defn set-depth-test!
  "Property.

  Member of State.

  Activates depth comparisons and updates to the depth buffer."
  [this val]
  (aset this "depthTest" val))

(defn offsets
  "Property.

  Member of State.

  Activates adding an offset to depth values of polygon's fragments"
  [this]
  (-> this .-offsets))

(defn set-offsets!
  "Property.

  Member of State.

  Activates adding an offset to depth values of polygon's fragments"
  [this val]
  (aset this "offsets" val))

(defn polygon-offset
  "Property.

  Member of State.

  The polygon offset. Setting this property to anything other than
  will automatically enable polygon offset fill."
  [this]
  (-> this .-polygonOffset))

(defn set-polygon-offset!
  "Property.

  Member of State.

  The polygon offset. Setting this property to anything other than
  will automatically enable polygon offset fill."
  [this val]
  (aset this "polygonOffset" val))

