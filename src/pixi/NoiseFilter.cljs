(ns pixi.NoiseFilter
  "Extends - Filter.

  A Noise effect filter."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/NoiseFilter))
  ([noise]
    (new js/NoiseFilter noise))
  ([noise seed]
    (new js/NoiseFilter noise seed)))

(defn noise
  "Property.

  Member of NoiseFilter.

  The amount of noise to apply, this value should be in the range
  1]."
  [this]
  (-> this .-noise))

(defn set-noise!
  "Property.

  Member of NoiseFilter.

  The amount of noise to apply, this value should be in the range
  1]."
  [this val]
  (aset this "noise" val))

(defn seed
  "Property.

  Member of NoiseFilter.

  A seed value to apply to the random noise generation. `Math.random()`
  a good value to use."
  [this]
  (-> this .-seed))

(defn set-seed!
  "Property.

  Member of NoiseFilter.

  A seed value to apply to the random noise generation. `Math.random()`
  a good value to use."
  [this val]
  (aset this "seed" val))

