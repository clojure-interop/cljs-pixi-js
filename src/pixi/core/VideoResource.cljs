(ns pixi.core.VideoResource
  "Extends - BaseImageResource.

  Resource type for HTMLVideoElement."
  (:refer-clojure :exclude [load test update]))

(defn new
  "Constructor."
  ([source]
    (new js/VideoResource source))
  ([source options]
    (new js/VideoResource source options)))

(defn *cross-origin
  "Method.

  Member of VideoResource.

  Set cross origin based detecting the url and the crossorigin"
  ([element url]
    (-> js/BaseImageResource (.crossOrigin element url)))
  ([element url crossorigin]
    (-> js/BaseImageResource (.crossOrigin element url crossorigin))))

(defn dispose
  "Method.

  Member of VideoResource.

  Destroys this texture"
  ([this]
    (-> this (.dispose))))

(defn load
  "Method.

  Member of VideoResource.

  Start preloading the video resource."
  ([this]
    (-> this (.load))))

(defn *test
  "Method.

  Member of VideoResource.

  Used to auto-detect the type of resource."
  ([source extension]
    (-> js/VideoResource (.test source extension))))

(defn update
  "Method.

  Member of VideoResource.

  Trigger updating of the texture"
  ([this]
    (-> this (.update)))
  ([this delta-time]
    (-> this (.update delta-time))))

(defn upload
  "Method.

  Member of VideoResource.

  Upload the texture to the GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture)))
  ([this renderer base-texture gl-texture source]
    (-> this (.upload renderer base-texture gl-texture source))))

(defn types
  "Property.

  Member of VideoResource.

  List of common video file extensions supported by VideoResource."
  []
  (-> js/VideoResource .-TYPES))

(defn set-types!
  "Property.

  Member of VideoResource.

  List of common video file extensions supported by VideoResource."
  [val]
  (aset js/VideoResource "TYPES" val))

(defn auto-play
  "Property.

  Member of VideoResource.

  When set to true will automatically play videos used by this
  once
  they are loaded. If false, it will not modify the playing state."
  [this]
  (-> this .-autoPlay))

(defn set-auto-play!
  "Property.

  Member of VideoResource.

  When set to true will automatically play videos used by this
  once
  they are loaded. If false, it will not modify the playing state."
  [this val]
  (aset this "autoPlay" val))

(defn auto-update
  "Property.

  Member of VideoResource.

  Should the base texture automatically update itself, set to true
  default"
  [this]
  (-> this .-autoUpdate))

(defn set-auto-update!
  "Property.

  Member of VideoResource.

  Should the base texture automatically update itself, set to true
  default"
  [this val]
  (aset this "autoUpdate" val))

(defn source
  "Property.

  Member of VideoResource.

  The source element"
  [this]
  (-> this .-source))

(defn set-source!
  "Property.

  Member of VideoResource.

  The source element"
  [this val]
  (aset this "source" val))

(defn update-fps
  "Property.

  Member of VideoResource.

  How many times a second to update the texture from the video.
  at 0 to update at every render.
  A lower fps can help performance, as updating the texture at
  on a 30ps video may not be efficient."
  [this]
  (-> this .-updateFPS))

(defn set-update-fps!
  "Property.

  Member of VideoResource.

  How many times a second to update the texture from the video.
  at 0 to update at every render.
  A lower fps can help performance, as updating the texture at
  on a 30ps video may not be efficient."
  [this val]
  (aset this "updateFPS" val))

