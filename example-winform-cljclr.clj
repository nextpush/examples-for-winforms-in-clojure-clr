(assembly-load-from "./System.Windows.Forms.dll")
(assembly-load-from "./System.Windows.Forms.Primitives.dll")
(assembly-load-from "./System.Windows.Forms.Design.dll")
(assembly-load-from "./System.Windows.Forms.Design.Editors.dll")

(import 
        (System.Windows.Forms Form Application Button TextBox FlowLayoutPanel DockStyle FlowDirection MessageBox)
        (System Drawing.Size EventHandler))

(do
    (def form1 (Form.))
    (set! (. form1 Text) "my window2")

    (def btn1 (Button.))
    (set! (. btn1 Text) "Click me")

    (def txt1 (TextBox.))
    (set! (. txt1 Multiline) true)
    (set! (. txt1 Size) (Size. 281 227))

    (def flowLayout (FlowLayoutPanel.))
    (set! (. flowLayout Dock) 
        (enum-val DockStyle "Fill"))
    (set! (. flowLayout FlowDirection) 
        (enum-val FlowDirection "TopDown"))

    (.Add (. form1 Controls) flowLayout)
    (.Add (. flowLayout Controls) txt1)
    (.Add (. flowLayout Controls) btn1)

    (def hdl1 
        (gen-delegate EventHandler [^System.Object sender, ^System.EventArgs e] 
            (MessageBox/Show "Hello world!")))

    (.add_Click btn1 hdl1)

    (Application/EnableVisualStyles)
    (Application/Run form1))