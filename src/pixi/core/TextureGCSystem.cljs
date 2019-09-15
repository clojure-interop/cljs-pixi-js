(ns pixi.core.TextureGCSystem
  "Extends - System.

  System plugin to the renderer to manage texture garbage collection
  the GPU,
  ensuring that it does not get clogged up with textures that are
  longer being used."
  (:refer-clojure :exclude [count]))

(defn new
  "Constructor."
  ([renderer]
    (new js/TextureGCSystem renderer)))

(defn destroy
  "Method.

  Member of TextureGCSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn postrender
  "Method.

  Member of TextureGCSystem.

  Checks to see when the last time a texture was used
  if the texture has not been used for a specified amount of time
  will be removed from the GPU"
  ([this]
    (-> this (.postrender))))

(defn run
  "Method.

  Member of TextureGCSystem.

  Checks to see when the last time a texture was used
  if the texture has not been used for a specified amount of time
  will be removed from the GPU"
  ([this]
    (-> this (.run))))

(defn unload
  "Method.

  Member of TextureGCSystem.

  Removes all the textures within the specified displayObject and
  children from the GPU"
  ([this display-object]
    (-> this (.unload display-object))))

(defn check-count
  "Property.

  Member of TextureGCSystem.

  Check count"
  [this]
  (-> this .-checkCount))

(defn set-check-count!
  "Property.

  Member of TextureGCSystem.

  Check count"
  [this val]
  (aset this "checkCount" val))

(defn check-count-max
  "Property.

  Member of TextureGCSystem.

  Maximum number of item to check"
  [this]
  (-> this .-checkCountMax))

(defn set-check-count-max!
  "Property.

  Member of TextureGCSystem.

  Maximum number of item to check"
  [this val]
  (aset this "checkCountMax" val))

(defn count
  "Property.

  Member of TextureGCSystem.

  Count"
  [this]
  (-> this .-count))

(defn set-count!
  "Property.

  Member of TextureGCSystem.

  Count"
  [this val]
  (aset this "count" val))

(defn max-idle
  "Property.

  Member of TextureGCSystem.

  Maximum idle time, in seconds"
  [this]
  (-> this .-maxIdle))

(defn set-max-idle!
  "Property.

  Member of TextureGCSystem.

  Maximum idle time, in seconds"
  [this val]
  (aset this "maxIdle" val))

(defn mode
  "Property.

  Member of TextureGCSystem.

  Current garabage collection mode"
  [this]
  (-> this .-mode))

(defn set-mode!
  "Property.

  Member of TextureGCSystem.

  Current garabage collection mode"
  [this val]
  (aset this "mode" val))

(defn renderer
  "Property.

  Member of TextureGCSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of TextureGCSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

