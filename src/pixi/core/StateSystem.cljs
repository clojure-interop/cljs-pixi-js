(ns pixi.core.StateSystem
  "Extends - System.

  System plugin to the renderer to manage WebGL state machines."
  (:refer-clojure :exclude [map set]))

(defn new
  "Constructor."
  ([renderer]
    (new js/StateSystem renderer)))

(defn *check-blend-mode
  "Method.

  Member of StateSystem.

  A private little wrapper function that we call to check the blend"
  ([state]
    (-> js/StateSystem (.checkBlendMode state))))

(defn *check-polygon-offset
  "Method.

  Member of StateSystem.

  A private little wrapper function that we call to check the polygon"
  ([state]
    (-> js/StateSystem (.checkPolygonOffset state))))

(defn destroy
  "Method.

  Member of StateSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn force-state
  "Method.

  Member of StateSystem.

  Sets the state, when previous state is unknown"
  ([this state]
    (-> this (.forceState state))))

(defn reset
  "Method.

  Member of StateSystem.

  Resets all the logic and disables the vaos"
  ([this]
    (-> this (.reset))))

(defn set
  "Method.

  Member of StateSystem.

  Sets the current state"
  ([this state]
    (-> this (.set state))))

(defn set-blend
  "Method.

  Member of StateSystem.

  Enables or disabled blending."
  ([this value]
    (-> this (.setBlend value))))

(defn set-blend-mode
  "Method.

  Member of StateSystem.

  Sets the blend mode."
  ([this value]
    (-> this (.setBlendMode value))))

(defn set-cull-face
  "Method.

  Member of StateSystem.

  Sets whether to enable or disable cull face."
  ([this value]
    (-> this (.setCullFace value))))

(defn set-depth-test
  "Method.

  Member of StateSystem.

  Sets whether to enable or disable depth test."
  ([this value]
    (-> this (.setDepthTest value))))

(defn set-front-face
  "Method.

  Member of StateSystem.

  Sets the gl front face."
  ([this value]
    (-> this (.setFrontFace value))))

(defn set-offset
  "Method.

  Member of StateSystem.

  Enables or disable polygon offset fill"
  ([this value]
    (-> this (.setOffset value))))

(defn set-polygon-offset
  "Method.

  Member of StateSystem.

  Sets the polygon offset."
  ([this value scale]
    (-> this (.setPolygonOffset value scale))))

(defn update-check
  "Method.

  Member of StateSystem.

  checks to see which updates should be checked based on which
  have been activated.
  For example, if blend is enabled then we should check the blend
  each time the state is changed
  or if polygon fill is activated then we need to check if the
  offset changes.
  The idea is that we only check what we have too."
  ([this func value]
    (-> this (.updateCheck func value))))

(defn blend-mode
  "Property.

  Member of StateSystem.

  Blend mode"
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of StateSystem.

  Blend mode"
  [this val]
  (aset this "blendMode" val))

(defn checks
  "Property.

  Member of StateSystem.

  Collection of check calls"
  [this]
  (-> this .-checks))

(defn set-checks!
  "Property.

  Member of StateSystem.

  Collection of check calls"
  [this val]
  (aset this "checks" val))

(defn default-state
  "Property.

  Member of StateSystem.

  Default WebGL State"
  [this]
  (-> this .-defaultState))

(defn set-default-state!
  "Property.

  Member of StateSystem.

  Default WebGL State"
  [this val]
  (aset this "defaultState" val))

(defn gl
  "Property.

  Member of StateSystem.

  GL context"
  [this]
  (-> this .-gl))

(defn set-gl!
  "Property.

  Member of StateSystem.

  GL context"
  [this val]
  (aset this "gl" val))

(defn map
  "Property.

  Member of StateSystem.

  Collection of calls"
  [this]
  (-> this .-map))

(defn set-map!
  "Property.

  Member of StateSystem.

  Collection of calls"
  [this val]
  (aset this "map" val))

(defn polygon-offset
  "Property.

  Member of StateSystem.

  Polygon offset"
  [this]
  (-> this .-polygonOffset))

(defn set-polygon-offset!
  "Property.

  Member of StateSystem.

  Polygon offset"
  [this val]
  (aset this "polygonOffset" val))

(defn renderer
  "Property.

  Member of StateSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of StateSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn state-id
  "Property.

  Member of StateSystem.

  State ID"
  [this]
  (-> this .-stateId))

(defn set-state-id!
  "Property.

  Member of StateSystem.

  State ID"
  [this val]
  (aset this "stateId" val))

