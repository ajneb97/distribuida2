public class Server
{
    public static void main(String[] args)
    {
        try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args))
        {
            com.zeroc.Ice.ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints("DimensionesAdapter", "default -p 10000");
            com.zeroc.Ice.Object object = new DimensionI();
            adapter.add(object, com.zeroc.Ice.Util.stringToIdentity("Dimensiones"));
            adapter.activate();
            communicator.waitForShutdown();
        }
    }
}
