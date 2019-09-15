(ns pixi.Ticker
  "A Ticker class that runs an update loop that other objects listen
  This class is composed around listeners meant for execution on
  next requested animation frame.
  Animation frames are requested only when necessary, e.g. When
  ticker is started and the emitter has listeners."
  (:refer-clojure :exclude [remove update]))

(defn new
  "Constructor."
  ([]
    (new js/Ticker)))

(defn add
  "Method.

  Member of Ticker.

  Register a handler for tick events. Calls continuously unless
  it is removed or the ticker is stopped."
  ([this fn]
    (-> this (.add fn)))
  ([this fn context]
    (-> this (.add fn context)))
  ([this fn context priority]
    (-> this (.add fn context priority))))

(defn add-once
  "Method.

  Member of Ticker.

  Add a handler for the tick event which is only execute once."
  ([this fn]
    (-> this (.addOnce fn)))
  ([this fn context]
    (-> this (.addOnce fn context)))
  ([this fn context priority]
    (-> this (.addOnce fn context priority))))

(defn destroy
  "Method.

  Member of Ticker.

  Destroy the ticker and don't use after this. Calling
  this method removes all references to internal events."
  ([this]
    (-> this (.destroy))))

(defn remove
  "Method.

  Member of Ticker.

  Removes any handlers matching the function and context parameters.
  If no handlers are left after removing, then it cancels the animation"
  ([this fn]
    (-> this (.remove fn)))
  ([this fn context]
    (-> this (.remove fn context))))

(defn start
  "Method.

  Member of Ticker.

  Starts the ticker. If the ticker has listeners
  a new animation frame is requested at this point."
  ([this]
    (-> this (.start))))

(defn stop
  "Method.

  Member of Ticker.

  Stops the ticker. If the ticker has requested
  an animation frame it is canceled at this point."
  ([this]
    (-> this (.stop))))

(defn update
  "Method.

  Member of Ticker.

  Triggers an update. An update entails setting the
  current {@link PIXI.Ticker#elapsedMS},
  the current {@link PIXI.Ticker#deltaTime},
  invoking all listeners with current deltaTime,
  and then finally setting {@link PIXI.Ticker#lastTime}
  with the value of currentTime that was provided.
  This method will be called automatically by animation
  frame callbacks if the ticker instance has been started
  and listeners are added."
  ([this]
    (-> this (.update)))
  ([this current-time]
    (-> this (.update current-time))))

(defn fps
  "Property.

  Member of Ticker.

  The frames per second at which this ticker is running.
  The default is approximately 60 in most modern browsers.
  **Note:** This does not factor in the value of
  {@link PIXI.Ticker#speed}, which is specific
  to scaling {@link PIXI.Ticker#deltaTime}."
  [this]
  (-> this .-FPS))

(defn set-fps!
  "Property.

  Member of Ticker.

  The frames per second at which this ticker is running.
  The default is approximately 60 in most modern browsers.
  **Note:** This does not factor in the value of
  {@link PIXI.Ticker#speed}, which is specific
  to scaling {@link PIXI.Ticker#deltaTime}."
  [this val]
  (aset this "FPS" val))

(defn auto-start
  "Property.

  Member of Ticker.

  Whether or not this ticker should invoke the method
  {@link PIXI.Ticker#start} automatically
  when a listener is added."
  [this]
  (-> this .-autoStart))

(defn set-auto-start!
  "Property.

  Member of Ticker.

  Whether or not this ticker should invoke the method
  {@link PIXI.Ticker#start} automatically
  when a listener is added."
  [this val]
  (aset this "autoStart" val))

(defn delta-ms
  "Property.

  Member of Ticker.

  Scaler time elapsed in milliseconds from last frame to this frame.
  This value is capped by setting {@link PIXI.Ticker#minFPS}
  and is scaled with {@link PIXI.Ticker#speed}.
  **Note:** The cap may be exceeded by scaling.
  If the platform supports DOMHighResTimeStamp,
  this value will have a precision of 1 µs.
  Defaults to target frame time"
  [this]
  (-> this .-deltaMS))

(defn set-delta-ms!
  "Property.

  Member of Ticker.

  Scaler time elapsed in milliseconds from last frame to this frame.
  This value is capped by setting {@link PIXI.Ticker#minFPS}
  and is scaled with {@link PIXI.Ticker#speed}.
  **Note:** The cap may be exceeded by scaling.
  If the platform supports DOMHighResTimeStamp,
  this value will have a precision of 1 µs.
  Defaults to target frame time"
  [this val]
  (aset this "deltaMS" val))

(defn delta-time
  "Property.

  Member of Ticker.

  Scalar time value from last frame to this frame.
  This value is capped by setting {@link PIXI.Ticker#minFPS}
  and is scaled with {@link PIXI.Ticker#speed}.
  **Note:** The cap may be exceeded by scaling."
  [this]
  (-> this .-deltaTime))

(defn set-delta-time!
  "Property.

  Member of Ticker.

  Scalar time value from last frame to this frame.
  This value is capped by setting {@link PIXI.Ticker#minFPS}
  and is scaled with {@link PIXI.Ticker#speed}.
  **Note:** The cap may be exceeded by scaling."
  [this val]
  (aset this "deltaTime" val))

(defn elapsed-ms
  "Property.

  Member of Ticker.

  Time elapsed in milliseconds from last frame to this frame.
  Opposed to what the scalar {@link PIXI.Ticker#deltaTime}
  is based, this value is neither capped nor scaled.
  If the platform supports DOMHighResTimeStamp,
  this value will have a precision of 1 µs.
  Defaults to target frame time"
  [this]
  (-> this .-elapsedMS))

(defn set-elapsed-ms!
  "Property.

  Member of Ticker.

  Time elapsed in milliseconds from last frame to this frame.
  Opposed to what the scalar {@link PIXI.Ticker#deltaTime}
  is based, this value is neither capped nor scaled.
  If the platform supports DOMHighResTimeStamp,
  this value will have a precision of 1 µs.
  Defaults to target frame time"
  [this val]
  (aset this "elapsedMS" val))

(defn last-time
  "Property.

  Member of Ticker.

  The last time {@link PIXI.Ticker#update} was invoked.
  This value is also reset internally outside of invoking
  update, but only when a new animation frame is requested.
  If the platform supports DOMHighResTimeStamp,
  this value will have a precision of 1 µs."
  [this]
  (-> this .-lastTime))

(defn set-last-time!
  "Property.

  Member of Ticker.

  The last time {@link PIXI.Ticker#update} was invoked.
  This value is also reset internally outside of invoking
  update, but only when a new animation frame is requested.
  If the platform supports DOMHighResTimeStamp,
  this value will have a precision of 1 µs."
  [this val]
  (aset this "lastTime" val))

(defn max-fps
  "Property.

  Member of Ticker.

  Manages the minimum amount of milliseconds required to
  elapse between invoking {@link PIXI.Ticker#update}.
  This will effect the measured value of {@link PIXI.Ticker#FPS}.
  If it is set to `0`, then there is no limit; PixiJS will render
  many frames as it can.
  Otherwise it will be at least `minFPS`"
  [this]
  (-> this .-maxFPS))

(defn set-max-fps!
  "Property.

  Member of Ticker.

  Manages the minimum amount of milliseconds required to
  elapse between invoking {@link PIXI.Ticker#update}.
  This will effect the measured value of {@link PIXI.Ticker#FPS}.
  If it is set to `0`, then there is no limit; PixiJS will render
  many frames as it can.
  Otherwise it will be at least `minFPS`"
  [this val]
  (aset this "maxFPS" val))

(defn min-fps
  "Property.

  Member of Ticker.

  Manages the maximum amount of milliseconds allowed to
  elapse between invoking {@link PIXI.Ticker#update}.
  This value is used to cap {@link PIXI.Ticker#deltaTime},
  but does not effect the measured value of {@link PIXI.Ticker#FPS}.
  When setting this property it is clamped to a value between
  `0` and `PIXI.settings.TARGET_FPMS * 1000`."
  [this]
  (-> this .-minFPS))

(defn set-min-fps!
  "Property.

  Member of Ticker.

  Manages the maximum amount of milliseconds allowed to
  elapse between invoking {@link PIXI.Ticker#update}.
  This value is used to cap {@link PIXI.Ticker#deltaTime},
  but does not effect the measured value of {@link PIXI.Ticker#FPS}.
  When setting this property it is clamped to a value between
  `0` and `PIXI.settings.TARGET_FPMS * 1000`."
  [this val]
  (aset this "minFPS" val))

(defn shared
  "Property.

  Member of Ticker.

  The shared ticker instance used by {@link PIXI.AnimatedSprite}
  by
  {@link PIXI.VideoResource} to update animation frames / video
  It may also be used by {@link PIXI.Application} if created with
  `sharedTicker` option property set to true.
  The property {@link PIXI.Ticker#autoStart} is set to `true` for
  instance.
  Please follow the examples for usage, including how to opt-out
  auto-starting the shared ticker."
  []
  (-> js/Ticker .-shared))

(defn set-shared!
  "Property.

  Member of Ticker.

  The shared ticker instance used by {@link PIXI.AnimatedSprite}
  by
  {@link PIXI.VideoResource} to update animation frames / video
  It may also be used by {@link PIXI.Application} if created with
  `sharedTicker` option property set to true.
  The property {@link PIXI.Ticker#autoStart} is set to `true` for
  instance.
  Please follow the examples for usage, including how to opt-out
  auto-starting the shared ticker."
  [val]
  (aset js/Ticker "shared" val))

(defn speed
  "Property.

  Member of Ticker.

  Factor of current {@link PIXI.Ticker#deltaTime}."
  [this]
  (-> this .-speed))

(defn set-speed!
  "Property.

  Member of Ticker.

  Factor of current {@link PIXI.Ticker#deltaTime}."
  [this val]
  (aset this "speed" val))

(defn started
  "Property.

  Member of Ticker.

  Whether or not this ticker has been started.
  `true` if {@link PIXI.Ticker#start} has been called.
  `false` if {@link PIXI.Ticker#stop} has been called.
  While `false`, this value may change to `true` in the
  event of {@link PIXI.Ticker#autoStart} being `true`
  and a listener is added."
  [this]
  (-> this .-started))

(defn set-started!
  "Property.

  Member of Ticker.

  Whether or not this ticker has been started.
  `true` if {@link PIXI.Ticker#start} has been called.
  `false` if {@link PIXI.Ticker#stop} has been called.
  While `false`, this value may change to `true` in the
  event of {@link PIXI.Ticker#autoStart} being `true`
  and a listener is added."
  [this val]
  (aset this "started" val))

(defn system
  "Property.

  Member of Ticker.

  The system ticker instance used by {@link PIXI.interaction.InteractionManager}
  by
  {@link PIXI.BasePrepare} for core timing functionality that shouldn't
  need to be paused,
  unlike the `shared` ticker which drives visual animations and
  which may want to be paused.
  The property {@link PIXI.Ticker#autoStart} is set to `true` for
  instance."
  []
  (-> js/Ticker .-system))

(defn set-system!
  "Property.

  Member of Ticker.

  The system ticker instance used by {@link PIXI.interaction.InteractionManager}
  by
  {@link PIXI.BasePrepare} for core timing functionality that shouldn't
  need to be paused,
  unlike the `shared` ticker which drives visual animations and
  which may want to be paused.
  The property {@link PIXI.Ticker#autoStart} is set to `true` for
  instance."
  [val]
  (aset js/Ticker "system" val))

