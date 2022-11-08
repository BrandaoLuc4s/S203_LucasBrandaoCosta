package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void deveContruirUmCarroPeloBuilder() {
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		Motor motorVTEC = new Motor();
		ComputadorBordo computadorSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		//Builder
		CarroBuilder carrobuilder = new CarroBuilder();
		carrobuilder.builderPortas(portas);
		carrobuilder.builderComputadorBordo(computadorSiemens);
		carrobuilder.builderMotor(motorVTEC);
		carrobuilder.buildersFreios(freioBosch);
		.getCarro();
		
		//Teste o carro contruido
		Carro carroContruido = carrobuilder.getCarro();

		assertNotNull( carroContruido);
		assertNotNull(carroContruido.getMotor());
		assertNotNull(carroContruido.getPortas());
		assertNotNull(carroContruido.getComputadorBordo());
		assertNotNull(carroContruido.getFreiosAbs());
		asserTrue(carroContruido.getPortas().lenght == 2);

	}
}

		
		
