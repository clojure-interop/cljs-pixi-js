(ns pixi.ParticleBuffer
  "The particle buffer manages the static and dynamic buffers for
  particle container."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([properties dynamic-property-flags size]
    (new js/ParticleBuffer properties dynamic-property-flags size)))

(defn destroy
  "Method.

  Member of ParticleBuffer.

  Destroys the ParticleBuffer."
  ([this]
    (-> this (.destroy))))

(defn init-buffers
  "Method.

  Member of ParticleBuffer.

  Sets up the renderer context and necessary buffers."
  ([this]
    (-> this (.initBuffers))))

(defn upload-dynamic
  "Method.

  Member of ParticleBuffer.

  Uploads the dynamic properties."
  ([this children start-index amount]
    (-> this (.uploadDynamic children start-index amount))))

(defn upload-static
  "Method.

  Member of ParticleBuffer.

  Uploads the static properties."
  ([this children start-index amount]
    (-> this (.uploadStatic children start-index amount))))

(defn dynamic-properties
  "Property.

  Member of ParticleBuffer.

  A list of the properties that are dynamic."
  [this]
  (-> this .-dynamicProperties))

(defn set-dynamic-properties!
  "Property.

  Member of ParticleBuffer.

  A list of the properties that are dynamic."
  [this val]
  (aset this "dynamicProperties" val))

(defn index-buffer
  "Property.

  Member of ParticleBuffer.

  Holds the indices of the geometry (quads) to draw"
  [this]
  (-> this .-indexBuffer))

(defn set-index-buffer!
  "Property.

  Member of ParticleBuffer.

  Holds the indices of the geometry (quads) to draw"
  [this val]
  (aset this "indexBuffer" val))

(defn size
  "Property.

  Member of ParticleBuffer.

  The number of particles the buffer can hold"
  [this]
  (-> this .-size))

(defn set-size!
  "Property.

  Member of ParticleBuffer.

  The number of particles the buffer can hold"
  [this val]
  (aset this "size" val))

(defn static-properties
  "Property.

  Member of ParticleBuffer.

  A list of the properties that are static."
  [this]
  (-> this .-staticProperties))

(defn set-static-properties!
  "Property.

  Member of ParticleBuffer.

  A list of the properties that are static."
  [this val]
  (aset this "staticProperties" val))

