(ns pixi.core.Attribute
  "Holds the information for a single attribute structure required
  render geometry.
  This does not contain the actual data, but instead has a buffer
  that maps to a {@link PIXI.Buffer}
  This can include anything from positions, uvs, normals, colors"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([buffer]
    (new js/Attribute buffer))
  ([buffer size]
    (new js/Attribute buffer size))
  ([buffer size normalized]
    (new js/Attribute buffer size normalized))
  ([buffer size normalized type]
    (new js/Attribute buffer size normalized type))
  ([buffer size normalized type stride]
    (new js/Attribute buffer size normalized type stride))
  ([buffer size normalized type stride start]
    (new js/Attribute buffer size normalized type stride start)))

(defn destroy
  "Method.

  Member of Attribute.

  Destroys the Attribute."
  ([this]
    (-> this (.destroy))))

(defn *from
  "Method.

  Member of Attribute.

  Helper function that creates an Attribute based on the information"
  ([buffer]
    (-> js/Attribute (.from buffer)))
  ([buffer size]
    (-> js/Attribute (.from buffer size)))
  ([buffer size stride]
    (-> js/Attribute (.from buffer size stride)))
  ([buffer size stride normalized]
    (-> js/Attribute (.from buffer size stride normalized))))

