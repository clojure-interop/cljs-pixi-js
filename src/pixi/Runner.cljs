(ns pixi.Runner
  "A Runner is a highly performant and simple alternative to signals.
  used in situations
  where events are dispatched to many objects at high frequency
  every frame!)
  like a signal..
  ```
  const myObject = {
  loaded: new PIXI.Runner('loaded')
  }
  const listener = {
  loaded: function(){
  // thin
  }
  }
  myObject.update.add(listener);
  myObject.loaded.emit();
  ```
  Or for handling calling the same function on many items
  ```
  const myGame = {
  update: new PIXI.Runner('update')
  }
  const gameObject = {
  update: function(time){
  // update my gamey state
  }
  }
  myGame.update.add(gameObject1);
  myGame.update.emit(time);
  ```"
  (:refer-clojure :exclude [empty name remove]))

(defn new
  "Constructor."
  ([name]
    (new js/Runner name)))

(defn add
  "Method.

  Member of Runner.

  Add a listener to the Runner
  Runners do not need to have scope or functions passed to them.
  All that is required is to pass the listening object and ensure
  it has contains a function that has the same name
  as the name provided to the Runner when it was created.
  Eg A listener passed to this Runner will require a 'complete'
  ```
  const complete = new PIXI.Runner('complete');
  ```
  The scope used will be the object itself."
  ([this item]
    (-> this (.add item))))

(defn contains
  "Method.

  Member of Runner.

  Check to see if the listener is already in the Runner"
  ([this item]
    (-> this (.contains item))))

(defn destroy
  "Method.

  Member of Runner.

  Remove all references, don't use after this."
  ([this]
    (-> this (.destroy))))

(defn dispatch
  "Method.

  Member of Runner.

  Alias for `emit`"
  ([this]
    (-> this (.dispatch))))

(defn emit
  "Method.

  Member of Runner.

  Dispatch/Broadcast Runner to all listeners added to the queue."
  ([this]
    (-> this (.emit))))

(defn remove
  "Method.

  Member of Runner.

  Remove a single listener from the dispatch queue."
  ([this item]
    (-> this (.remove item))))

(defn remove-all
  "Method.

  Member of Runner.

  Remove all listeners from the Runner"
  ([this]
    (-> this (.removeAll))))

(defn run
  "Method.

  Member of Runner.

  Alias for `emit`"
  ([this]
    (-> this (.run))))

(defn empty
  "Property.

  Member of Runner.

  `true` if there are no this Runner contains no listeners"
  [this]
  (-> this .-empty))

(defn set-empty!
  "Property.

  Member of Runner.

  `true` if there are no this Runner contains no listeners"
  [this val]
  (aset this "empty" val))

(defn name
  "Property.

  Member of Runner.

  The name of the runner."
  [this]
  (-> this .-name))

(defn set-name!
  "Property.

  Member of Runner.

  The name of the runner."
  [this val]
  (aset this "name" val))

