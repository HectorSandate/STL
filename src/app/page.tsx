import { HeroParallaxDemo } from "./components/herosection";
import { ScrollSection } from "./components/scrollSection";
import Link from "next/link";

export default function Home() {
  return (
    <>
      <div className="min-h-screen p-8 pb-20">
        <HeroParallaxDemo />
      </div>
      <ScrollSection />
      
      <div className="flex justify-center items-center py-4 bg-gray-100">
        <Link href="/traffic-light">
          <button className="bg-blue-500 text-white px-6 py-3 rounded-md hover:bg-blue-600 transition">
            Ir al Simulador de Semáforo
          </button>
        </Link>
      </div>
    </>
  );
}
