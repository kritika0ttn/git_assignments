package java_A;

class CustomException extends Exception
        {

        }
        class TestCustom{
    public static void main(String args[])
    {
        try
        {
            throw new CustomException();
        }
        catch (CustomException ex)
        {
            System.out.println("Caught the exception");
//            System.out.println(ex.getMessage());
        }

        System.out.println("rest of the code...");
    }
}