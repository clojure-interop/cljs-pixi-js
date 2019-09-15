(ns pixi.core.ViewableBuffer
  "Flexible wrapper around `ArrayBuffer` that also provides
  typed array views on demand."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([size]
    (new js/ViewableBuffer size)))

(defn destroy
  "Method.

  Member of ViewableBuffer.

  Destroys all buffer references. Do not use after calling
  this."
  ([this]
    (-> this (.destroy))))

(defn view
  "Method.

  Member of ViewableBuffer.

  Returns the view of the given type."
  ([this type]
    (-> this (.view type))))

(defn float32view
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Float32Array`."
  [this]
  (-> this .-float32View))

(defn set-float32view!
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Float32Array`."
  [this val]
  (aset this "float32View" val))

(defn int16view
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Int16Array`."
  [this]
  (-> this .-int16View))

(defn set-int16view!
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Int16Array`."
  [this val]
  (aset this "int16View" val))

(defn int32view
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Int32Array`."
  [this]
  (-> this .-int32View))

(defn set-int32view!
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Int32Array`."
  [this val]
  (aset this "int32View" val))

(defn int8view
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Int8Array`."
  [this]
  (-> this .-int8View))

(defn set-int8view!
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Int8Array`."
  [this val]
  (aset this "int8View" val))

(defn raw-binary-data
  "Property.

  Member of ViewableBuffer.

  Underlying `ArrayBuffer` that holds all the data
  and is of capacity `size`."
  [this]
  (-> this .-rawBinaryData))

(defn set-raw-binary-data!
  "Property.

  Member of ViewableBuffer.

  Underlying `ArrayBuffer` that holds all the data
  and is of capacity `size`."
  [this val]
  (aset this "rawBinaryData" val))

(defn uint16view
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Uint16Array`."
  [this]
  (-> this .-uint16View))

(defn set-uint16view!
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Uint16Array`."
  [this val]
  (aset this "uint16View" val))

(defn uint32view
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Uint32Array`."
  [this]
  (-> this .-uint32View))

(defn set-uint32view!
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Uint32Array`."
  [this val]
  (aset this "uint32View" val))

(defn uint8view
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Uint8Array`."
  [this]
  (-> this .-uint8View))

(defn set-uint8view!
  "Property.

  Member of ViewableBuffer.

  View on the raw binary data as a `Uint8Array`."
  [this val]
  (aset this "uint8View" val))

