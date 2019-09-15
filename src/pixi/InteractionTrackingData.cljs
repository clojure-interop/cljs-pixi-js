(ns pixi.InteractionTrackingData
  "DisplayObjects with the {@link PIXI.interaction.interactiveTarget}
  use this class to track interactions"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([pointer-id]
    (new js/InteractionTrackingData pointer-id)))

(defn flags
  "Property.

  Member of InteractionTrackingData.

  State of the tracking data, expressed as bit flags"
  [this]
  (-> this .-flags))

(defn set-flags!
  "Property.

  Member of InteractionTrackingData.

  State of the tracking data, expressed as bit flags"
  [this val]
  (aset this "flags" val))

(defn left-down
  "Property.

  Member of InteractionTrackingData.

  Did the left mouse button come down in the DisplayObject?"
  [this]
  (-> this .-leftDown))

(defn set-left-down!
  "Property.

  Member of InteractionTrackingData.

  Did the left mouse button come down in the DisplayObject?"
  [this val]
  (aset this "leftDown" val))

(defn none
  "Property.

  Member of InteractionTrackingData.

  Is the tracked event inactive (not over or down)?"
  [this]
  (-> this .-none))

(defn set-none!
  "Property.

  Member of InteractionTrackingData.

  Is the tracked event inactive (not over or down)?"
  [this val]
  (aset this "none" val))

(defn over
  "Property.

  Member of InteractionTrackingData.

  Is the tracked event over the DisplayObject?"
  [this]
  (-> this .-over))

(defn set-over!
  "Property.

  Member of InteractionTrackingData.

  Is the tracked event over the DisplayObject?"
  [this val]
  (aset this "over" val))

(defn pointer-id
  "Property.

  Member of InteractionTrackingData.

  Unique pointer id of the event"
  [this]
  (-> this .-pointerId))

(defn set-pointer-id!
  "Property.

  Member of InteractionTrackingData.

  Unique pointer id of the event"
  [this val]
  (aset this "pointerId" val))

(defn right-down
  "Property.

  Member of InteractionTrackingData.

  Did the right mouse button come down in the DisplayObject?"
  [this]
  (-> this .-rightDown))

(defn set-right-down!
  "Property.

  Member of InteractionTrackingData.

  Did the right mouse button come down in the DisplayObject?"
  [this val]
  (aset this "rightDown" val))

