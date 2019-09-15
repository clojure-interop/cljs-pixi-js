(ns pixi.core.ImageResource
  "Extends - BaseImageResource.

  Resource type for HTMLImageElement."
  (:refer-clojure :exclude [load update]))

(defn new
  "Constructor."
  ([source]
    (new js/ImageResource source)))

(defn *cross-origin
  "Method.

  Member of ImageResource.

  Set cross origin based detecting the url and the crossorigin"
  ([element url]
    (-> js/BaseImageResource (.crossOrigin element url)))
  ([element url crossorigin]
    (-> js/BaseImageResource (.crossOrigin element url crossorigin))))

(defn dispose
  "Method.

  Member of ImageResource.

  Destroys this texture"
  ([this]
    (-> this (.dispose))))

(defn load
  "Method.

  Member of ImageResource.

  returns a promise when image will be loaded and processed"
  ([this]
    (-> this (.load)))
  ([this create-bitmap]
    (-> this (.load create-bitmap))))

(defn process
  "Method.

  Member of ImageResource.

  Called when we need to convert image into BitmapImage.
  Can be called multiple times, real promise is cached inside."
  ([this]
    (-> this (.process))))

(defn update
  "Method.

  Member of ImageResource.

  Checks if source width/height was changed, resize can cause extra
  update.
  Triggers one update in any case."
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of ImageResource.

  Upload the image resource to GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture))))

(defn bitmap
  "Property.

  Member of ImageResource.

  The ImageBitmap element created for HTMLImageElement"
  [this]
  (-> this .-bitmap))

(defn set-bitmap!
  "Property.

  Member of ImageResource.

  The ImageBitmap element created for HTMLImageElement"
  [this val]
  (aset this "bitmap" val))

(defn create-bitmap
  "Property.

  Member of ImageResource.

  If capable, convert the image using createImageBitmap API"
  [this]
  (-> this .-createBitmap))

(defn set-create-bitmap!
  "Property.

  Member of ImageResource.

  If capable, convert the image using createImageBitmap API"
  [this val]
  (aset this "createBitmap" val))

(defn premultiply-alpha
  "Property.

  Member of ImageResource.

  Controls texture premultiplyAlpha field
  Copies from options"
  [this]
  (-> this .-premultiplyAlpha))

(defn set-premultiply-alpha!
  "Property.

  Member of ImageResource.

  Controls texture premultiplyAlpha field
  Copies from options"
  [this val]
  (aset this "premultiplyAlpha" val))

(defn preserve-bitmap
  "Property.

  Member of ImageResource.

  If the image should be disposed after upload"
  [this]
  (-> this .-preserveBitmap))

(defn set-preserve-bitmap!
  "Property.

  Member of ImageResource.

  If the image should be disposed after upload"
  [this val]
  (aset this "preserveBitmap" val))

(defn source
  "Property.

  Member of ImageResource.

  The source element"
  [this]
  (-> this .-source))

(defn set-source!
  "Property.

  Member of ImageResource.

  The source element"
  [this val]
  (aset this "source" val))

(defn url
  "Property.

  Member of ImageResource.

  URL of the image source"
  [this]
  (-> this .-url))

(defn set-url!
  "Property.

  Member of ImageResource.

  URL of the image source"
  [this val]
  (aset this "url" val))

