Frame madhe image insert karnyasathi  
ImageIcon cha use 

ImageIcon  obj = new ImageIcon (ClassLoader.getSystemResource("image_path");


To adjust image size use Image class 

Image obj1 = obj.getImage().getScaledInstance (img_len,img_bredth,Image.scale_default);


Can't set an image on frame directly so
to set the image on frame we have to put it in label format... 

To put it in label ..have to convert image to ImageIcon 
So
ImageIcon obj2 = new ImageIcon (obj1); 

Then
Jlabel l1 = new JLabel ( obj2) ; 

frame_obj.add(l1);