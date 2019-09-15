(ns pixi.CountLimiter
  "CountLimiter limits the number of items handled by a {@link PIXI.prepare.BasePrepare}
  a specified
  number of items per frame."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([max-items-per-frame]
    (new js/CountLimiter max-items-per-frame)))

(defn allowed-to-upload
  "Method.

  Member of CountLimiter.

  Checks to see if another item can be uploaded. This should only
  called once per item."
  ([this]
    (-> this (.allowedToUpload))))

(defn begin-frame
  "Method.

  Member of CountLimiter.

  Resets any counting properties to start fresh on a new frame."
  ([this]
    (-> this (.beginFrame))))

(defn items-left
  "Property.

  Member of CountLimiter.

  The number of items that can be prepared in the current frame."
  [this]
  (-> this .-itemsLeft))

(defn set-items-left!
  "Property.

  Member of CountLimiter.

  The number of items that can be prepared in the current frame."
  [this val]
  (aset this "itemsLeft" val))

(defn max-items-per-frame
  "Property.

  Member of CountLimiter.

  The maximum number of items that can be prepared each frame."
  [this]
  (-> this .-maxItemsPerFrame))

(defn set-max-items-per-frame!
  "Property.

  Member of CountLimiter.

  The maximum number of items that can be prepared each frame."
  [this val]
  (aset this "maxItemsPerFrame" val))

