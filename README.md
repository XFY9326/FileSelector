# FileSelector
Select File or Folder

-------------------
- Using Method:

int ResultCode = 2;

SelectFile file = new SelectFile(ResultCode, SelectFile.TYPE_ChooseFile);
//Or you can use      SelectFile.TYPE_ChooseFolder

file.setFileType("js");
//Set File Type(Not necessary)

file.start(MainActivity.this);
//Start Select With Your Activity

@Override
protected void onActivityResult (int requestCode, int resultCode, Intent data)
{
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == ResultCode)
        {
            String Path = data.getStringExtra("FilePath");
            //Get File Path Now
        }
}

------------------
