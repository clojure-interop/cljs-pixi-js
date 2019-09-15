(ns pixi.TickerPlugin
  "Middleware for for Application Ticker."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/TickerPlugin)))

(defn *destroy
  "Method.

  Member of TickerPlugin.

  Clean up the ticker, scoped to application."
  ([]
    (-> js/TickerPlugin (.destroy))))

(defn *init
  "Method.

  Member of TickerPlugin.

  Initialize the plugin with scope of application instance"
  ([]
    (-> js/TickerPlugin (.init)))
  ([options]
    (-> js/TickerPlugin (.init options))))

(defn start
  "Method.

  Member of TickerPlugin.

  Convenience method for starting the render."
  ([this]
    (-> this (.start))))

(defn stop
  "Method.

  Member of TickerPlugin.

  Convenience method for stopping the render."
  ([this]
    (-> this (.stop))))

(defn ticker
  "Property.

  Member of TickerPlugin.

  Ticker for doing render updates."
  [this]
  (-> this .-ticker))

(defn set-ticker!
  "Property.

  Member of TickerPlugin.

  Ticker for doing render updates."
  [this val]
  (aset this "ticker" val))

