(ns pixi.InteractionEvent
  "Event class that mimics native DOM events."
  (:refer-clojure :exclude [type]))

(defn new
  "Constructor."
  ([]
    (new js/InteractionEvent)))

(defn reset
  "Method.

  Member of InteractionEvent.

  Resets the event."
  ([this]
    (-> this (.reset))))

(defn stop-propagation
  "Method.

  Member of InteractionEvent.

  Prevents event from reaching any objects other than the current"
  ([this]
    (-> this (.stopPropagation))))

(defn current-target
  "Property.

  Member of InteractionEvent.

  The object whose event listener’s callback is currently being"
  [this]
  (-> this .-currentTarget))

(defn set-current-target!
  "Property.

  Member of InteractionEvent.

  The object whose event listener’s callback is currently being"
  [this val]
  (aset this "currentTarget" val))

(defn data
  "Property.

  Member of InteractionEvent.

  InteractionData related to this event"
  [this]
  (-> this .-data))

(defn set-data!
  "Property.

  Member of InteractionEvent.

  InteractionData related to this event"
  [this val]
  (aset this "data" val))

(defn stopped
  "Property.

  Member of InteractionEvent.

  Whether this event will continue propagating in the tree"
  [this]
  (-> this .-stopped))

(defn set-stopped!
  "Property.

  Member of InteractionEvent.

  Whether this event will continue propagating in the tree"
  [this val]
  (aset this "stopped" val))

(defn target
  "Property.

  Member of InteractionEvent.

  The object which caused this event to be dispatched.
  For listener callback see {@link PIXI.interaction.InteractionEvent.currentTarget}."
  [this]
  (-> this .-target))

(defn set-target!
  "Property.

  Member of InteractionEvent.

  The object which caused this event to be dispatched.
  For listener callback see {@link PIXI.interaction.InteractionEvent.currentTarget}."
  [this val]
  (aset this "target" val))

(defn type
  "Property.

  Member of InteractionEvent.

  Type of the event"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of InteractionEvent.

  Type of the event"
  [this val]
  (aset this "type" val))

