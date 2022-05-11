import It_03.MyService;
import It_03.impl.Czxy;

module one {
    exports It_01;
    exports It_03;

   // provides MyService with It;
    provides MyService with Czxy;
}