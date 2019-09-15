(ns pixi.InteractionData
  "Holds all information related to an Interaction event"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/InteractionData)))

(defn copy-event
  "Method.

  Member of InteractionData.

  Copies properties from normalized event data."
  ([this event]
    (-> this (.copyEvent event))))

(defn get-local-position
  "Method.

  Member of InteractionData.

  This will return the local coordinates of the specified displayObject
  this InteractionData"
  ([this display-object]
    (-> this (.getLocalPosition display-object)))
  ([this display-object point]
    (-> this (.getLocalPosition display-object point)))
  ([this display-object point global-pos]
    (-> this (.getLocalPosition display-object point global-pos))))

(defn reset
  "Method.

  Member of InteractionData.

  Resets the data for pooling."
  ([this]
    (-> this (.reset))))

(defn button
  "Property.

  Member of InteractionData.

  Indicates which button was pressed on the mouse or pointer device
  trigger the event."
  [this]
  (-> this .-button))

(defn set-button!
  "Property.

  Member of InteractionData.

  Indicates which button was pressed on the mouse or pointer device
  trigger the event."
  [this val]
  (aset this "button" val))

(defn buttons
  "Property.

  Member of InteractionData.

  Indicates which buttons are pressed on the mouse or pointer device
  the event is triggered."
  [this]
  (-> this .-buttons))

(defn set-buttons!
  "Property.

  Member of InteractionData.

  Indicates which buttons are pressed on the mouse or pointer device
  the event is triggered."
  [this val]
  (aset this "buttons" val))

(defn global
  "Property.

  Member of InteractionData.

  This point stores the global coords of where the touch/mouse
  happened"
  [this]
  (-> this .-global))

(defn set-global!
  "Property.

  Member of InteractionData.

  This point stores the global coords of where the touch/mouse
  happened"
  [this val]
  (aset this "global" val))

(defn height
  "Property.

  Member of InteractionData.

  The height of the pointer's contact along the y-axis, measured
  CSS pixels.
  radiusY of TouchEvents will be represented by this value."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of InteractionData.

  The height of the pointer's contact along the y-axis, measured
  CSS pixels.
  radiusY of TouchEvents will be represented by this value."
  [this val]
  (aset this "height" val))

(defn identifier
  "Property.

  Member of InteractionData.

  Unique identifier for this interaction"
  [this]
  (-> this .-identifier))

(defn set-identifier!
  "Property.

  Member of InteractionData.

  Unique identifier for this interaction"
  [this val]
  (aset this "identifier" val))

(defn is-primary
  "Property.

  Member of InteractionData.

  Indicates whether or not the pointer device that created the
  is the primary pointer."
  [this]
  (-> this .-isPrimary))

(defn set-is-primary!
  "Property.

  Member of InteractionData.

  Indicates whether or not the pointer device that created the
  is the primary pointer."
  [this val]
  (aset this "isPrimary" val))

(defn original-event
  "Property.

  Member of InteractionData.

  When passed to an event handler, this will be the original DOM
  that was captured"
  [this]
  (-> this .-originalEvent))

(defn set-original-event!
  "Property.

  Member of InteractionData.

  When passed to an event handler, this will be the original DOM
  that was captured"
  [this val]
  (aset this "originalEvent" val))

(defn pointer-id
  "Property.

  Member of InteractionData.

  The unique identifier of the pointer. It will be the same as"
  [this]
  (-> this .-pointerId))

(defn set-pointer-id!
  "Property.

  Member of InteractionData.

  The unique identifier of the pointer. It will be the same as"
  [this val]
  (aset this "pointerId" val))

(defn pointer-type
  "Property.

  Member of InteractionData.

  The type of pointer that triggered the event."
  [this]
  (-> this .-pointerType))

(defn set-pointer-type!
  "Property.

  Member of InteractionData.

  The type of pointer that triggered the event."
  [this val]
  (aset this "pointerType" val))

(defn pressure
  "Property.

  Member of InteractionData.

  Pressure applied by the pointing device during the event. A Touch's
  property
  will be represented by this value."
  [this]
  (-> this .-pressure))

(defn set-pressure!
  "Property.

  Member of InteractionData.

  Pressure applied by the pointing device during the event. A Touch's
  property
  will be represented by this value."
  [this val]
  (aset this "pressure" val))

(defn rotation-angle
  "Property.

  Member of InteractionData.

  From TouchEvents (not PointerEvents triggered by touches), the
  of the Touch."
  [this]
  (-> this .-rotationAngle))

(defn set-rotation-angle!
  "Property.

  Member of InteractionData.

  From TouchEvents (not PointerEvents triggered by touches), the
  of the Touch."
  [this val]
  (aset this "rotationAngle" val))

(defn tangential-pressure
  "Property.

  Member of InteractionData.

  Barrel pressure on a stylus pointer."
  [this]
  (-> this .-tangentialPressure))

(defn set-tangential-pressure!
  "Property.

  Member of InteractionData.

  Barrel pressure on a stylus pointer."
  [this val]
  (aset this "tangentialPressure" val))

(defn target
  "Property.

  Member of InteractionData.

  The target Sprite that was interacted with"
  [this]
  (-> this .-target))

(defn set-target!
  "Property.

  Member of InteractionData.

  The target Sprite that was interacted with"
  [this val]
  (aset this "target" val))

(defn tilt-x
  "Property.

  Member of InteractionData.

  The angle, in degrees, between the pointer device and the screen."
  [this]
  (-> this .-tiltX))

(defn set-tilt-x!
  "Property.

  Member of InteractionData.

  The angle, in degrees, between the pointer device and the screen."
  [this val]
  (aset this "tiltX" val))

(defn tilt-y
  "Property.

  Member of InteractionData.

  The angle, in degrees, between the pointer device and the screen."
  [this]
  (-> this .-tiltY))

(defn set-tilt-y!
  "Property.

  Member of InteractionData.

  The angle, in degrees, between the pointer device and the screen."
  [this val]
  (aset this "tiltY" val))

(defn twist
  "Property.

  Member of InteractionData.

  Twist of a stylus pointer."
  [this]
  (-> this .-twist))

(defn set-twist!
  "Property.

  Member of InteractionData.

  Twist of a stylus pointer."
  [this val]
  (aset this "twist" val))

(defn width
  "Property.

  Member of InteractionData.

  The width of the pointer's contact along the x-axis, measured
  CSS pixels.
  radiusX of TouchEvents will be represented by this value."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of InteractionData.

  The width of the pointer's contact along the x-axis, measured
  CSS pixels.
  radiusX of TouchEvents will be represented by this value."
  [this val]
  (aset this "width" val))

