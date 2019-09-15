(ns pixi.AppLoaderPlugin
  "Application plugin for supporting loader option. Installing the
  is not necessary if using **pixi.js** or **pixi.js-legacy**."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/AppLoaderPlugin)))

(defn *destroy
  "Method.

  Member of AppLoaderPlugin.

  Called when application destroyed"
  ([]
    (-> js/AppLoaderPlugin (.destroy))))

(defn *init
  "Method.

  Member of AppLoaderPlugin.

  Called on application constructor"
  ([options]
    (-> js/AppLoaderPlugin (.init options))))

(defn loader
  "Property.

  Member of AppLoaderPlugin.

  Loader instance to help with asset loading."
  [this]
  (-> this .-loader))

(defn set-loader!
  "Property.

  Member of AppLoaderPlugin.

  Loader instance to help with asset loading."
  [this val]
  (aset this "loader" val))

