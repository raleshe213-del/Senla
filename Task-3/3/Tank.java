public class Tank implements AssemblyLine {
    @Override
    public void assemble_tank(Chassis b_ch, Turret b_tu, Track b_tr) {
        b_ch.bulid_chassis();
        b_tu.build_turret();
        b_tr.build_tracks();
        System.out.println("All three parts are assembled");
    }
}
