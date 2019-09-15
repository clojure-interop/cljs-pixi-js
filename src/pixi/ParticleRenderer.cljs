(ns pixi.ParticleRenderer
  "Renderer for Particles that is designer for speed over feature"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/ParticleRenderer renderer)))

(defn destroy
  "Method.

  Member of ParticleRenderer.

  Destroys the ParticleRenderer."
  ([this]
    (-> this (.destroy))))

(defn generate-buffers
  "Method.

  Member of ParticleRenderer.

  Creates one particle buffer for each child in the container we
  to render and updates internal properties"
  ([this container]
    (-> this (.generateBuffers container))))

(defn render
  "Method.

  Member of ParticleRenderer.

  Renders the particle container object."
  ([this container]
    (-> this (.render container))))

(defn upload-position
  "Method.

  Member of ParticleRenderer.

  Uploads the position."
  ([this children start-index amount array stride offset]
    (-> this (.uploadPosition children start-index amount array stride offset))))

(defn upload-rotation
  "Method.

  Member of ParticleRenderer.

  Uploads the rotiation."
  ([this children start-index amount array stride offset]
    (-> this (.uploadRotation children start-index amount array stride offset))))

(defn upload-tint
  "Method.

  Member of ParticleRenderer.

  Uploads the tint."
  ([this children start-index amount array stride offset]
    (-> this (.uploadTint children start-index amount array stride offset))))

(defn upload-uvs
  "Method.

  Member of ParticleRenderer.

  Uploads the Uvs"
  ([this children start-index amount array stride offset]
    (-> this (.uploadUvs children start-index amount array stride offset))))

(defn upload-vertices
  "Method.

  Member of ParticleRenderer.

  Uploads the vertices."
  ([this children start-index amount array stride offset]
    (-> this (.uploadVertices children start-index amount array stride offset))))

(defn shader
  "Property.

  Member of ParticleRenderer.

  The default shader that is used if a sprite doesn't have a more
  one."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of ParticleRenderer.

  The default shader that is used if a sprite doesn't have a more
  one."
  [this val]
  (aset this "shader" val))

