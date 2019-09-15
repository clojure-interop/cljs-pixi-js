(ns pixi.AccessibilityManager
  "The Accessibility manager recreates the ability to tab and have
  read by screen readers.
  This is very important as it can possibly help people with disabilities
  PixiJS content.
  A DisplayObject can be made accessible just like it can be made
  This manager will map the
  events as if the mouse was being used, minimizing the effort
  to implement.
  An instance of this class is automatically created by default,
  can be found at `renderer.plugins.accessibility`"
  (:refer-clojure :exclude [update]))

(defn new
  "Constructor."
  ([renderer]
    (new js/AccessibilityManager renderer)))

(defn activate
  "Method.

  Member of AccessibilityManager.

  Activating will cause the Accessibility layer to be shown.
  This is called when a user presses the tab key."
  ([this]
    (-> this (.activate))))

(defn add-child
  "Method.

  Member of AccessibilityManager.

  Adds a DisplayObject to the accessibility manager"
  ([this display-object]
    (-> this (.addChild display-object))))

(defn cap-hit-area
  "Method.

  Member of AccessibilityManager.

  Adjust the hit area based on the bounds of a display object"
  ([this hit-area]
    (-> this (.capHitArea hit-area))))

(defn create-touch-hook
  "Method.

  Member of AccessibilityManager.

  Creates the touch hooks."
  ([this]
    (-> this (.createTouchHook))))

(defn deactivate
  "Method.

  Member of AccessibilityManager.

  Deactivating will cause the Accessibility layer to be hidden.
  This is called when a user moves the mouse."
  ([this]
    (-> this (.deactivate))))

(defn destroy
  "Method.

  Member of AccessibilityManager.

  Destroys the accessibility manager"
  ([this]
    (-> this (.destroy))))

(defn destroy-touch-hook
  "Method.

  Member of AccessibilityManager.

  Destroys the touch hooks."
  ([this]
    (-> this (.destroyTouchHook))))

(defn update
  "Method.

  Member of AccessibilityManager.

  Before each render this function will ensure that all divs are
  correctly to their DisplayObjects."
  ([this]
    (-> this (.update))))

(defn update-accessible-objects
  "Method.

  Member of AccessibilityManager.

  This recursive function will run through the scene graph and
  any new accessible objects to the DOM layer."
  ([this display-object]
    (-> this (.updateAccessibleObjects display-object))))

(defn children
  "Property.

  Member of AccessibilityManager.

  The array of currently active accessible items."
  [this]
  (-> this .-children))

(defn set-children!
  "Property.

  Member of AccessibilityManager.

  The array of currently active accessible items."
  [this val]
  (aset this "children" val))

(defn debug
  "Property.

  Member of AccessibilityManager.

  Setting this to true will visually show the divs."
  [this]
  (-> this .-debug))

(defn set-debug!
  "Property.

  Member of AccessibilityManager.

  Setting this to true will visually show the divs."
  [this val]
  (aset this "debug" val))

(defn div
  "Property.

  Member of AccessibilityManager.

  This is the dom element that will sit over the PixiJS element.
  is where the div overlays will go."
  [this]
  (-> this .-div))

(defn set-div!
  "Property.

  Member of AccessibilityManager.

  This is the dom element that will sit over the PixiJS element.
  is where the div overlays will go."
  [this val]
  (aset this "div" val))

(defn is-active
  "Property.

  Member of AccessibilityManager.

  A flag"
  [this]
  (-> this .-isActive))

(defn set-is-active!
  "Property.

  Member of AccessibilityManager.

  A flag"
  [this val]
  (aset this "isActive" val))

(defn is-mobile-accessibility
  "Property.

  Member of AccessibilityManager.

  A flag"
  [this]
  (-> this .-isMobileAccessibility))

(defn set-is-mobile-accessibility!
  "Property.

  Member of AccessibilityManager.

  A flag"
  [this val]
  (aset this "isMobileAccessibility" val))

(defn pool
  "Property.

  Member of AccessibilityManager.

  A simple pool for storing divs."
  [this]
  (-> this .-pool))

(defn set-pool!
  "Property.

  Member of AccessibilityManager.

  A simple pool for storing divs."
  [this val]
  (aset this "pool" val))

(defn render-id
  "Property.

  Member of AccessibilityManager.

  This is a tick used to check if an object is no longer being"
  [this]
  (-> this .-renderId))

(defn set-render-id!
  "Property.

  Member of AccessibilityManager.

  This is a tick used to check if an object is no longer being"
  [this val]
  (aset this "renderId" val))

(defn renderer
  "Property.

  Member of AccessibilityManager.

  The renderer this accessibility manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of AccessibilityManager.

  The renderer this accessibility manager works for."
  [this val]
  (aset this "renderer" val))

