(ns pixi.TimeLimiter
  "TimeLimiter limits the number of items handled by a {@link PIXI.BasePrepare}
  a specified
  number of milliseconds per frame."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([max-milliseconds]
    (new js/TimeLimiter max-milliseconds)))

(defn allowed-to-upload
  "Method.

  Member of TimeLimiter.

  Checks to see if another item can be uploaded. This should only
  called once per item."
  ([this]
    (-> this (.allowedToUpload))))

(defn begin-frame
  "Method.

  Member of TimeLimiter.

  Resets any counting properties to start fresh on a new frame."
  ([this]
    (-> this (.beginFrame))))

(defn frame-start
  "Property.

  Member of TimeLimiter.

  The start time of the current frame."
  [this]
  (-> this .-frameStart))

(defn set-frame-start!
  "Property.

  Member of TimeLimiter.

  The start time of the current frame."
  [this val]
  (aset this "frameStart" val))

(defn max-milliseconds
  "Property.

  Member of TimeLimiter.

  The maximum milliseconds that can be spent preparing items each"
  [this]
  (-> this .-maxMilliseconds))

(defn set-max-milliseconds!
  "Property.

  Member of TimeLimiter.

  The maximum milliseconds that can be spent preparing items each"
  [this val]
  (aset this "maxMilliseconds" val))

