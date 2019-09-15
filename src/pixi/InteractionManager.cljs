(ns pixi.InteractionManager
  "Extends - EventEmitter.

  The interaction manager deals with mouse, touch and pointer events.
  Any DisplayObject can be interactive if its `interactive` property
  set to true.
  This manager also supports multitouch.
  An instance of this class is automatically created by default,
  can be found at `renderer.plugins.interaction`"
  (:refer-clojure :exclude [update]))

(defn new
  "Constructor."
  ([renderer]
    (new js/InteractionManager renderer))
  ([renderer options]
    (new js/InteractionManager renderer options)))

(defn add-events
  "Method.

  Member of InteractionManager.

  Registers all the DOM events"
  ([this]
    (-> this (.addEvents))))

(defn configure-interaction-event-for-dom-event
  "Method.

  Member of InteractionManager.

  Configure an InteractionEvent to wrap a DOM PointerEvent and"
  ([this interaction-event pointer-event interaction-data]
    (-> this (.configureInteractionEventForDOMEvent interaction-event pointer-event interaction-data))))

(defn delay-dispatch-event
  "Method.

  Member of InteractionManager.

  Puts a event on a queue to be dispatched later. This is used
  guarantee correct
  ordering of over/out events."
  ([this display-object event-string event-data]
    (-> this (.delayDispatchEvent display-object event-string event-data))))

(defn destroy
  "Method.

  Member of InteractionManager.

  Destroys the interaction manager"
  ([this]
    (-> this (.destroy))))

(defn dispatch-event
  "Method.

  Member of InteractionManager.

  Dispatches an event on the display object that was interacted"
  ([this display-object event-string event-data]
    (-> this (.dispatchEvent display-object event-string event-data))))

(defn get-interaction-data-for-pointer-id
  "Method.

  Member of InteractionManager.

  Get InteractionData for a given pointerId. Store that data as"
  ([this event]
    (-> this (.getInteractionDataForPointerId event))))

(defn hit-test
  "Method.

  Member of InteractionManager.

  Hit tests a point against the display tree, returning the first
  object that is hit."
  ([this global-point]
    (-> this (.hitTest global-point)))
  ([this global-point root]
    (-> this (.hitTest global-point root))))

(defn map-position-to-point
  "Method.

  Member of InteractionManager.

  Maps x and y coords from a DOM object and maps them correctly
  the PixiJS view. The
  resulting value is stored in the point. This takes into account
  fact that the DOM
  element could be scaled and positioned anywhere on the screen."
  ([this point x y]
    (-> this (.mapPositionToPoint point x y))))

(defn normalize-to-pointer-data
  "Method.

  Member of InteractionManager.

  Ensures that the original event object contains all data that
  regular pointer event would have"
  ([this event]
    (-> this (.normalizeToPointerData event))))

(defn on-pointer-cancel
  "Method.

  Member of InteractionManager.

  Is called when the pointer button is cancelled"
  ([this event]
    (-> this (.onPointerCancel event))))

(defn on-pointer-complete
  "Method.

  Member of InteractionManager.

  Is called when the pointer button is released on the renderer"
  ([this original-event cancelled func]
    (-> this (.onPointerComplete original-event cancelled func))))

(defn on-pointer-down
  "Method.

  Member of InteractionManager.

  Is called when the pointer button is pressed down on the renderer"
  ([this original-event]
    (-> this (.onPointerDown original-event))))

(defn on-pointer-move
  "Method.

  Member of InteractionManager.

  Is called when the pointer moves across the renderer element"
  ([this original-event]
    (-> this (.onPointerMove original-event))))

(defn on-pointer-out
  "Method.

  Member of InteractionManager.

  Is called when the pointer is moved out of the renderer element"
  ([this original-event]
    (-> this (.onPointerOut original-event))))

(defn on-pointer-over
  "Method.

  Member of InteractionManager.

  Is called when the pointer is moved into the renderer element"
  ([this original-event]
    (-> this (.onPointerOver original-event))))

(defn on-pointer-up
  "Method.

  Member of InteractionManager.

  Is called when the pointer button is released on the renderer"
  ([this event]
    (-> this (.onPointerUp event))))

(defn process-interactive
  "Method.

  Member of InteractionManager.

  This function is provides a neat way of crawling through the
  graph and running a
  specified function on all interactive objects it finds. It will
  take care of hit
  testing the interactive objects and passes the hit across in
  function."
  ([this interaction-event display-object]
    (-> this (.processInteractive interaction-event display-object)))
  ([this interaction-event display-object func]
    (-> this (.processInteractive interaction-event display-object func)))
  ([this interaction-event display-object func hit-test]
    (-> this (.processInteractive interaction-event display-object func hit-test)))
  ([this interaction-event display-object func hit-test interactive]
    (-> this (.processInteractive interaction-event display-object func hit-test interactive)))
  ([this interaction-event display-object func hit-test interactive skip-delayed]
    (-> this (.processInteractive interaction-event display-object func hit-test interactive skip-delayed))))

(defn process-pointer-cancel
  "Method.

  Member of InteractionManager.

  Processes the result of the pointer cancel check and dispatches
  event if need be"
  ([this interaction-event display-object]
    (-> this (.processPointerCancel interaction-event display-object))))

(defn process-pointer-down
  "Method.

  Member of InteractionManager.

  Processes the result of the pointer down check and dispatches
  event if need be"
  ([this interaction-event display-object hit]
    (-> this (.processPointerDown interaction-event display-object hit))))

(defn process-pointer-move
  "Method.

  Member of InteractionManager.

  Processes the result of the pointer move check and dispatches
  event if need be"
  ([this interaction-event display-object hit]
    (-> this (.processPointerMove interaction-event display-object hit))))

(defn process-pointer-over-out
  "Method.

  Member of InteractionManager.

  Processes the result of the pointer over/out check and dispatches
  event if need be"
  ([this interaction-event display-object hit]
    (-> this (.processPointerOverOut interaction-event display-object hit))))

(defn process-pointer-up
  "Method.

  Member of InteractionManager.

  Processes the result of the pointer up check and dispatches the
  if need be"
  ([this interaction-event display-object hit]
    (-> this (.processPointerUp interaction-event display-object hit))))

(defn release-interaction-data-for-pointer-id
  "Method.

  Member of InteractionManager.

  Return unused InteractionData to the pool, for a given pointerId"
  ([this pointer-id]
    (-> this (.releaseInteractionDataForPointerId pointer-id))))

(defn remove-events
  "Method.

  Member of InteractionManager.

  Removes all the DOM events that were previously registered"
  ([this]
    (-> this (.removeEvents))))

(defn set-cursor-mode
  "Method.

  Member of InteractionManager.

  Sets the current cursor mode, handling any callbacks or CSS style"
  ([this mode]
    (-> this (.setCursorMode mode))))

(defn set-target-element
  "Method.

  Member of InteractionManager.

  Sets the DOM element which will receive mouse/touch events. This
  useful for when you have
  other DOM elements on top of the renderers Canvas element. With
  you'll be bale to delegate
  another DOM element to receive those events."
  ([this element]
    (-> this (.setTargetElement element)))
  ([this element resolution]
    (-> this (.setTargetElement element resolution))))

(defn update
  "Method.

  Member of InteractionManager.

  Updates the state of interactive objects.
  Invoked by a throttled ticker update from {@link PIXI.Ticker.system}."
  ([this delta-time]
    (-> this (.update delta-time))))

(defn active-interaction-data
  "Property.

  Member of InteractionManager.

  Actively tracked InteractionData"
  [this]
  (-> this .-activeInteractionData))

(defn set-active-interaction-data!
  "Property.

  Member of InteractionManager.

  Actively tracked InteractionData"
  [this val]
  (aset this "activeInteractionData" val))

(defn auto-prevent-default
  "Property.

  Member of InteractionManager.

  Should default browser actions automatically be prevented.
  Does not apply to pointer events for backwards compatibility
  preventDefault on pointer events stops mouse events from firing
  Thus, for every pointer event, there will always be either a
  of touch event alongside it."
  [this]
  (-> this .-autoPreventDefault))

(defn set-auto-prevent-default!
  "Property.

  Member of InteractionManager.

  Should default browser actions automatically be prevented.
  Does not apply to pointer events for backwards compatibility
  preventDefault on pointer events stops mouse events from firing
  Thus, for every pointer event, there will always be either a
  of touch event alongside it."
  [this val]
  (aset this "autoPreventDefault" val))

(defn current-cursor-mode
  "Property.

  Member of InteractionManager.

  The mode of the cursor that is being used.
  The value of this is a key from the cursorStyles dictionary."
  [this]
  (-> this .-currentCursorMode))

(defn set-current-cursor-mode!
  "Property.

  Member of InteractionManager.

  The mode of the cursor that is being used.
  The value of this is a key from the cursorStyles dictionary."
  [this val]
  (aset this "currentCursorMode" val))

(defn cursor
  "Property.

  Member of InteractionManager.

  Internal cached let."
  [this]
  (-> this .-cursor))

(defn set-cursor!
  "Property.

  Member of InteractionManager.

  Internal cached let."
  [this val]
  (aset this "cursor" val))

(defn cursor-styles
  "Property.

  Member of InteractionManager.

  Dictionary of how different cursor modes are handled. Strings
  handled as CSS cursor
  values, objects are handled as dictionaries of CSS values for
  and functions are called instead of changing the CSS.
  Default CSS cursor values are provided for 'default' and 'pointer'"
  [this]
  (-> this .-cursorStyles))

(defn set-cursor-styles!
  "Property.

  Member of InteractionManager.

  Dictionary of how different cursor modes are handled. Strings
  handled as CSS cursor
  values, objects are handled as dictionaries of CSS values for
  and functions are called instead of changing the CSS.
  Default CSS cursor values are provided for 'default' and 'pointer'"
  [this val]
  (aset this "cursorStyles" val))

(defn delayed-events
  "Property.

  Member of InteractionManager.

  Delayed pointer events. Used to guarantee correct ordering of
  events."
  [this]
  (-> this .-delayedEvents))

(defn set-delayed-events!
  "Property.

  Member of InteractionManager.

  Delayed pointer events. Used to guarantee correct ordering of
  events."
  [this val]
  (aset this "delayedEvents" val))

(defn event-data
  "Property.

  Member of InteractionManager.

  An event data object to handle all the event tracking/dispatching"
  [this]
  (-> this .-eventData))

(defn set-event-data!
  "Property.

  Member of InteractionManager.

  An event data object to handle all the event tracking/dispatching"
  [this val]
  (aset this "eventData" val))

(defn events-added
  "Property.

  Member of InteractionManager.

  Have events been attached to the dom element?"
  [this]
  (-> this .-eventsAdded))

(defn set-events-added!
  "Property.

  Member of InteractionManager.

  Have events been attached to the dom element?"
  [this val]
  (aset this "eventsAdded" val))

(defn interaction-dom-element
  "Property.

  Member of InteractionManager.

  The DOM element to bind to."
  [this]
  (-> this .-interactionDOMElement))

(defn set-interaction-dom-element!
  "Property.

  Member of InteractionManager.

  The DOM element to bind to."
  [this val]
  (aset this "interactionDOMElement" val))

(defn interaction-data-pool
  "Property.

  Member of InteractionManager.

  Pool of unused InteractionData"
  [this]
  (-> this .-interactionDataPool))

(defn set-interaction-data-pool!
  "Property.

  Member of InteractionManager.

  Pool of unused InteractionData"
  [this val]
  (aset this "interactionDataPool" val))

(defn interaction-frequency
  "Property.

  Member of InteractionManager.

  Frequency in milliseconds that the mousemove, mouseover & mouseout
  events will be checked."
  [this]
  (-> this .-interactionFrequency))

(defn set-interaction-frequency!
  "Property.

  Member of InteractionManager.

  Frequency in milliseconds that the mousemove, mouseover & mouseout
  events will be checked."
  [this val]
  (aset this "interactionFrequency" val))

(defn mouse
  "Property.

  Member of InteractionManager.

  The mouse data"
  [this]
  (-> this .-mouse))

(defn set-mouse!
  "Property.

  Member of InteractionManager.

  The mouse data"
  [this val]
  (aset this "mouse" val))

(defn mouse-over-renderer
  "Property.

  Member of InteractionManager.

  Is the mouse hovering over the renderer?"
  [this]
  (-> this .-mouseOverRenderer))

(defn set-mouse-over-renderer!
  "Property.

  Member of InteractionManager.

  Is the mouse hovering over the renderer?"
  [this val]
  (aset this "mouseOverRenderer" val))

(defn move-when-inside
  "Property.

  Member of InteractionManager.

  This property determines if mousemove and touchmove events are
  only when the cursor
  is over the object.
  Setting to true will make things work more in line with how the
  version works.
  Setting to false can make things easier for things like dragging
  It is currently set to false as this is how PixiJS used to work.
  will be set to true in
  future versions of pixi."
  [this]
  (-> this .-moveWhenInside))

(defn set-move-when-inside!
  "Property.

  Member of InteractionManager.

  This property determines if mousemove and touchmove events are
  only when the cursor
  is over the object.
  Setting to true will make things work more in line with how the
  version works.
  Setting to false can make things easier for things like dragging
  It is currently set to false as this is how PixiJS used to work.
  will be set to true in
  future versions of pixi."
  [this val]
  (aset this "moveWhenInside" val))

(defn renderer
  "Property.

  Member of InteractionManager.

  The renderer this interaction manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of InteractionManager.

  The renderer this interaction manager works for."
  [this val]
  (aset this "renderer" val))

(defn resolution
  "Property.

  Member of InteractionManager.

  The current resolution / device pixel ratio."
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of InteractionManager.

  The current resolution / device pixel ratio."
  [this val]
  (aset this "resolution" val))

(defn supports-pointer-events
  "Property.

  Member of InteractionManager.

  Does the device support pointer events
  https://www.w3.org/Submission/pointer-events/"
  [this]
  (-> this .-supportsPointerEvents))

(defn set-supports-pointer-events!
  "Property.

  Member of InteractionManager.

  Does the device support pointer events
  https://www.w3.org/Submission/pointer-events/"
  [this val]
  (aset this "supportsPointerEvents" val))

(defn supports-touch-events
  "Property.

  Member of InteractionManager.

  Does the device support touch events
  https://www.w3.org/TR/touch-events/"
  [this]
  (-> this .-supportsTouchEvents))

(defn set-supports-touch-events!
  "Property.

  Member of InteractionManager.

  Does the device support touch events
  https://www.w3.org/TR/touch-events/"
  [this val]
  (aset this "supportsTouchEvents" val))

