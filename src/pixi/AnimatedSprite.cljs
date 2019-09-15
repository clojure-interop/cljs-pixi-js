(ns pixi.AnimatedSprite
  "Extends - Sprite.

  An AnimatedSprite is a simple way to display an animation depicted
  a list of textures.
  ```js
  let alienImages = [\"image_sequence_01.png\",\"image_sequence_02.png\",\"image_sequence_03.png\",\"image_sequence_04.png\"];
  let textureArray = [];
  for (let i=0; i < 4; i++)
  {
  let texture = PIXI.Texture.from(alienImages[i]);
  textureArray.push(texture);
  };
  let animatedSprite = new PIXI.AnimatedSprite(textureArray);
  ```
  The more efficient and simpler way to create an animated sprite
  using a {@link PIXI.Spritesheet}
  containing the animation definitions:
  ```js
  PIXI.Loader.shared.add(\"assets/spritesheet.json\").load(setup);
  function setup() {
  let sheet = PIXI.Loader.shared.resources[\"assets/spritesheet.json\"].spritesheet;
  animatedSprite = new PIXI.AnimatedSprite(sheet.animations[\"image_sequence\"]);
  ...
  }
  ```"
  (:refer-clojure :exclude [loop update]))

(defn new
  "Constructor."
  ([textures]
    (new js/AnimatedSprite textures))
  ([textures auto-update]
    (new js/AnimatedSprite textures auto-update)))

(defn calculate-trimmed-vertices
  "Method.

  Member of AnimatedSprite.

  calculates worldTransform * vertices for a non texture with a
  store it in vertexTrimmedData
  This is used to ensure that the true width and height of a trimmed
  is respected"
  ([this]
    (-> this (.calculateTrimmedVertices))))

(defn calculate-vertices
  "Method.

  Member of AnimatedSprite.

  calculates worldTransform * vertices, store it in vertexData"
  ([this]
    (-> this (.calculateVertices))))

(defn contains-point
  "Method.

  Member of AnimatedSprite.

  Tests if a point is inside this sprite"
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of AnimatedSprite.

  Stops the AnimatedSprite and destroys it."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn *from
  "Method.

  Member of AnimatedSprite.

  Helper function that creates a new sprite based on the source
  provide.
  The source can be - frame id, image url, video url, canvas element,
  element, base texture"
  ([source]
    (-> js/Sprite (.from source)))
  ([source options]
    (-> js/Sprite (.from source options))))

(defn *from-frames
  "Method.

  Member of AnimatedSprite.

  A short hand way of creating an AnimatedSprite from an array
  frame ids."
  ([frames]
    (-> js/AnimatedSprite (.fromFrames frames))))

(defn *from-images
  "Method.

  Member of AnimatedSprite.

  A short hand way of creating an AnimatedSprite from an array
  image ids."
  ([images]
    (-> js/AnimatedSprite (.fromImages images))))

(defn get-local-bounds
  "Method.

  Member of AnimatedSprite.

  Gets the local bounds of the sprite object."
  ([this]
    (-> this (.getLocalBounds)))
  ([this rect]
    (-> this (.getLocalBounds rect))))

(defn goto-and-play
  "Method.

  Member of AnimatedSprite.

  Goes to a specific frame and begins playing the AnimatedSprite."
  ([this frame-number]
    (-> this (.gotoAndPlay frame-number))))

(defn goto-and-stop
  "Method.

  Member of AnimatedSprite.

  Stops the AnimatedSprite and goes to a specific frame."
  ([this frame-number]
    (-> this (.gotoAndStop frame-number))))

(defn play
  "Method.

  Member of AnimatedSprite.

  Plays the AnimatedSprite."
  ([this]
    (-> this (.play))))

(defn stop
  "Method.

  Member of AnimatedSprite.

  Stops the AnimatedSprite."
  ([this]
    (-> this (.stop))))

(defn update
  "Method.

  Member of AnimatedSprite.

  Updates the object transform for rendering."
  ([this delta-time]
    (-> this (.update delta-time))))

(defn update-texture
  "Method.

  Member of AnimatedSprite.

  Updates the displayed texture to match the current frame index."
  ([this]
    (-> this (.updateTexture))))

(defn anchor
  "Property.

  Member of AnimatedSprite.

  The anchor sets the origin point of the text. The default value
  taken from the {@link PIXI.Texture|Texture}
  and passed to the constructor.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner.
  If you pass only single parameter, it will set both x and y to
  same value as shown in the example below."
  [this]
  (-> this .-anchor))

(defn set-anchor!
  "Property.

  Member of AnimatedSprite.

  The anchor sets the origin point of the text. The default value
  taken from the {@link PIXI.Texture|Texture}
  and passed to the constructor.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner.
  If you pass only single parameter, it will set both x and y to
  same value as shown in the example below."
  [this val]
  (aset this "anchor" val))

(defn animation-speed
  "Property.

  Member of AnimatedSprite.

  The speed that the AnimatedSprite will play at. Higher is faster,
  is slower."
  [this]
  (-> this .-animationSpeed))

(defn set-animation-speed!
  "Property.

  Member of AnimatedSprite.

  The speed that the AnimatedSprite will play at. Higher is faster,
  is slower."
  [this val]
  (aset this "animationSpeed" val))

(defn blend-mode
  "Property.

  Member of AnimatedSprite.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of AnimatedSprite.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn current-frame
  "Property.

  Member of AnimatedSprite.

  The AnimatedSprites current frame index."
  [this]
  (-> this .-currentFrame))

(defn set-current-frame!
  "Property.

  Member of AnimatedSprite.

  The AnimatedSprites current frame index."
  [this val]
  (aset this "currentFrame" val))

(defn height
  "Property.

  Member of AnimatedSprite.

  The height of the sprite, setting this will actually modify the
  to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of AnimatedSprite.

  The height of the sprite, setting this will actually modify the
  to achieve the value set"
  [this val]
  (aset this "height" val))

(defn is-sprite
  "Property.

  Member of AnimatedSprite.

  used to fast check if a sprite is.. a sprite!"
  [this]
  (-> this .-isSprite))

(defn set-is-sprite!
  "Property.

  Member of AnimatedSprite.

  used to fast check if a sprite is.. a sprite!"
  [this val]
  (aset this "isSprite" val))

(defn loop
  "Property.

  Member of AnimatedSprite.

  Whether or not the animate sprite repeats after playing."
  [this]
  (-> this .-loop))

(defn set-loop!
  "Property.

  Member of AnimatedSprite.

  Whether or not the animate sprite repeats after playing."
  [this val]
  (aset this "loop" val))

(defn on-complete
  "Property.

  Member of AnimatedSprite.

  Function to call when an AnimatedSprite finishes playing."
  [this]
  (-> this .-onComplete))

(defn set-on-complete!
  "Property.

  Member of AnimatedSprite.

  Function to call when an AnimatedSprite finishes playing."
  [this val]
  (aset this "onComplete" val))

(defn on-frame-change
  "Property.

  Member of AnimatedSprite.

  Function to call when an AnimatedSprite changes which texture
  being rendered."
  [this]
  (-> this .-onFrameChange))

(defn set-on-frame-change!
  "Property.

  Member of AnimatedSprite.

  Function to call when an AnimatedSprite changes which texture
  being rendered."
  [this val]
  (aset this "onFrameChange" val))

(defn on-loop
  "Property.

  Member of AnimatedSprite.

  Function to call when `loop` is true, and an AnimatedSprite is
  and loops around to start again."
  [this]
  (-> this .-onLoop))

(defn set-on-loop!
  "Property.

  Member of AnimatedSprite.

  Function to call when `loop` is true, and an AnimatedSprite is
  and loops around to start again."
  [this val]
  (aset this "onLoop" val))

(defn playing
  "Property.

  Member of AnimatedSprite.

  Indicates if the AnimatedSprite is currently playing."
  [this]
  (-> this .-playing))

(defn set-playing!
  "Property.

  Member of AnimatedSprite.

  Indicates if the AnimatedSprite is currently playing."
  [this val]
  (aset this "playing" val))

(defn plugin-name
  "Property.

  Member of AnimatedSprite.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  & '_renderCanvas' methods."
  [this]
  (-> this .-pluginName))

(defn set-plugin-name!
  "Property.

  Member of AnimatedSprite.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  & '_renderCanvas' methods."
  [this val]
  (aset this "pluginName" val))

(defn round-pixels
  "Property.

  Member of AnimatedSprite.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this]
  (-> this .-roundPixels))

(defn set-round-pixels!
  "Property.

  Member of AnimatedSprite.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this val]
  (aset this "roundPixels" val))

(defn shader
  "Property.

  Member of AnimatedSprite.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of AnimatedSprite.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this val]
  (aset this "shader" val))

(defn texture
  "Property.

  Member of AnimatedSprite.

  The texture that the sprite is using"
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of AnimatedSprite.

  The texture that the sprite is using"
  [this val]
  (aset this "texture" val))

(defn textures
  "Property.

  Member of AnimatedSprite.

  The array of textures used for this AnimatedSprite."
  [this]
  (-> this .-textures))

(defn set-textures!
  "Property.

  Member of AnimatedSprite.

  The array of textures used for this AnimatedSprite."
  [this val]
  (aset this "textures" val))

(defn tint
  "Property.

  Member of AnimatedSprite.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of AnimatedSprite.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this val]
  (aset this "tint" val))

(defn total-frames
  "Property.

  Member of AnimatedSprite.

  The total number of frames in the AnimatedSprite. This is the
  as number of textures
  assigned to the AnimatedSprite."
  [this]
  (-> this .-totalFrames))

(defn set-total-frames!
  "Property.

  Member of AnimatedSprite.

  The total number of frames in the AnimatedSprite. This is the
  as number of textures
  assigned to the AnimatedSprite."
  [this val]
  (aset this "totalFrames" val))

(defn update-anchor
  "Property.

  Member of AnimatedSprite.

  Update anchor to [Texture's defaultAnchor]{@link PIXI.Texture#defaultAnchor}
  frame changes.
  Useful with [sprite sheet animations]{@link PIXI.Spritesheet#animations}
  with tools.
  Changing anchor for each frame allows to pin sprite origin to
  moving feature
  of the frame (e.g. left foot).
  Note: Enabling this will override any previously set `anchor`
  each frame change."
  [this]
  (-> this .-updateAnchor))

(defn set-update-anchor!
  "Property.

  Member of AnimatedSprite.

  Update anchor to [Texture's defaultAnchor]{@link PIXI.Texture#defaultAnchor}
  frame changes.
  Useful with [sprite sheet animations]{@link PIXI.Spritesheet#animations}
  with tools.
  Changing anchor for each frame allows to pin sprite origin to
  moving feature
  of the frame (e.g. left foot).
  Note: Enabling this will override any previously set `anchor`
  each frame change."
  [this val]
  (aset this "updateAnchor" val))

(defn vertex-data
  "Property.

  Member of AnimatedSprite.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this]
  (-> this .-vertexData))

(defn set-vertex-data!
  "Property.

  Member of AnimatedSprite.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this val]
  (aset this "vertexData" val))

(defn vertex-trimmed-data
  "Property.

  Member of AnimatedSprite.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this]
  (-> this .-vertexTrimmedData))

(defn set-vertex-trimmed-data!
  "Property.

  Member of AnimatedSprite.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this val]
  (aset this "vertexTrimmedData" val))

(defn width
  "Property.

  Member of AnimatedSprite.

  The width of the sprite, setting this will actually modify the
  to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of AnimatedSprite.

  The width of the sprite, setting this will actually modify the
  to achieve the value set"
  [this val]
  (aset this "width" val))

