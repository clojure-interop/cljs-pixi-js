(ns pixi.TickerListener
  "Internal class for handling the priority sorting of ticker handlers."
  (:refer-clojure :exclude [fn next]))

(defn new
  "Constructor.

  Constructor"
  ([fn]
    (new js/TickerListener fn))
  ([fn context]
    (new js/TickerListener fn context))
  ([fn context priority]
    (new js/TickerListener fn context priority))
  ([fn context priority once]
    (new js/TickerListener fn context priority once)))

(defn connect
  "Method.

  Member of TickerListener.

  Connect to the list."
  ([this previous]
    (-> this (.connect previous))))

(defn destroy
  "Method.

  Member of TickerListener.

  Destroy and don't use after this."
  ([this]
    (-> this (.destroy)))
  ([this hard]
    (-> this (.destroy hard))))

(defn emit
  "Method.

  Member of TickerListener.

  Emit by calling the current function."
  ([this delta-time]
    (-> this (.emit delta-time))))

(defn match
  "Method.

  Member of TickerListener.

  Simple compare function to figure out if a function and context"
  ([this fn context]
    (-> this (.match fn context))))

(defn context
  "Property.

  Member of TickerListener.

  The calling to execute."
  [this]
  (-> this .-context))

(defn set-context!
  "Property.

  Member of TickerListener.

  The calling to execute."
  [this val]
  (aset this "context" val))

(defn fn
  "Property.

  Member of TickerListener.

  The handler function to execute."
  [this]
  (-> this .-fn))

(defn set-fn!
  "Property.

  Member of TickerListener.

  The handler function to execute."
  [this val]
  (aset this "fn" val))

(defn next
  "Property.

  Member of TickerListener.

  The next item in chain."
  [this]
  (-> this .-next))

(defn set-next!
  "Property.

  Member of TickerListener.

  The next item in chain."
  [this val]
  (aset this "next" val))

(defn once
  "Property.

  Member of TickerListener.

  If this should only execute once."
  [this]
  (-> this .-once))

(defn set-once!
  "Property.

  Member of TickerListener.

  If this should only execute once."
  [this val]
  (aset this "once" val))

(defn previous
  "Property.

  Member of TickerListener.

  The previous item in chain."
  [this]
  (-> this .-previous))

(defn set-previous!
  "Property.

  Member of TickerListener.

  The previous item in chain."
  [this val]
  (aset this "previous" val))

(defn priority
  "Property.

  Member of TickerListener.

  The current priority."
  [this]
  (-> this .-priority))

(defn set-priority!
  "Property.

  Member of TickerListener.

  The current priority."
  [this val]
  (aset this "priority" val))

