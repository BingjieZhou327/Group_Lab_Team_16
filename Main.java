public class Main {
    public static void main(String[] args) {
        // 注意：其他成员的类文件需要在他们的分支合并后才能正常运行
        // 目前只有Member1.java可用
        
        System.out.println("=== Team Greeting Program ===");
        
        // Member1 greeting (已实现)
        Member1.main(args);
        
        // 以下代码将在其他成员提交后启用
        // Member2.main(args);
        // Member3.main(args);
        // Member4.main(args); // 如果是4人小组
        
        System.out.println("=== End of Greetings ===");
    }
}
