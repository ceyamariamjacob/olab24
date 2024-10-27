package newshelf;
import oldshelf.FictionType;
record Fiction(tring name,FictionType ft)implements IBook{
    @Override
    public String getTitle(){
        return name;
    }
}