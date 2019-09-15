(ns pixi.core.Buffer
  "A wrapper for data so that it can be used and uploaded by WebGL"
  (:refer-clojure :exclude [update]))

(defn new
  "Constructor."
  ([data]
    (new js/Buffer data))
  ([data static]
    (new js/Buffer data static))
  ([data static index]
    (new js/Buffer data static index)))

(defn destroy
  "Method.

  Member of Buffer.

  Destroys the buffer"
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of Buffer.

  disposes WebGL resources that are connected to this geometry"
  ([this]
    (-> this (.dispose))))

(defn *from
  "Method.

  Member of Buffer.

  Helper function that creates a buffer based on an array or TypedArray"
  ([data]
    (-> js/Buffer (.from data))))

(defn update
  "Method.

  Member of Buffer.

  flags this buffer as requiring an upload to the GPU"
  ([this]
    (-> this (.update)))
  ([this data]
    (-> this (.update data))))

(defn data
  "Property.

  Member of Buffer.

  The data in the buffer, as a typed array"
  [this]
  (-> this .-data))

(defn set-data!
  "Property.

  Member of Buffer.

  The data in the buffer, as a typed array"
  [this val]
  (aset this "data" val))

