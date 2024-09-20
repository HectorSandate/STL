// Componente que simulara el estatus del semaforo
import { useState } from 'react';
import styles from '../../styles/Traffic_Light.module.css'; 

const TrafficLight = () => {
  const [activeLight, setActiveLight] = useState(null); // Estado para rastrear la luz activa

  const handleClick = (color) => {
    // Cambia la luz activa al color que se hace clic
    setActiveLight(activeLight === color ? null : color);
  };

  return (
    <div className={styles.trafficLight}>
      <div
        className={`${styles.light} ${styles.red} ${activeLight === 'red' ? styles.active : ''}`}
        onClick={() => handleClick('red')}
      />
      <div
        className={`${styles.light} ${styles.yellow} ${activeLight === 'yellow' ? styles.active : ''}`}
        onClick={() => handleClick('yellow')}
      />
      <div
        className={`${styles.light} ${styles.green} ${activeLight === 'green' ? styles.active : ''}`}
        onClick={() => handleClick('green')}
      />
    </div>
  );
};

export default TrafficLight;
