// Marvish Chandra

fun masculine(scent,isUnisex){
    if scent == "musky":
        print("Use this scent as an everyday scent since it be used everywhere you go.")
    if isUnisex == "musky":
        return false;
    if scent == "vanilla":
        print("Use this scent when going to a feminine event or you are trying to have a small demeanor.")
    if isUnisex == "vanilla":
        return true;
    if scent == "zesty":
        print("Use this scent when being outdoors or at an event with a large group of people.")
    if isUnisex == "zesty":
        return false;
    if scent == "grass":
        print("This scent is similar to being in a woods atmosphere. Definitely use this scent outdoors.")
    if isUnisex == "grass":
        return false;
    if scent == "lavender smell":
        print("Use this scent when being at a feminine event or trying to attract someone who likes similar smells.")
    if isUnisex == "lavender smell":
        return true;
    if scent == "cedar and amber":
        print("These two smells deliver a clean smell that deliver an outstanding smell. This combination is low profile.")
    if isUnisex == "cedar and amber":
        return true;
}


fun feminine(scent,isUnisex){}