package br.com.alura.coldchella;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.time.Duration;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService service;

    private final Sinks.Many<EventoDto> eventoSink;

    public EventoController(EventoService service) {
        this.service = service;
        this.eventoSink = Sinks.many().multicast().onBackpressureBuffer();
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<EventoDto> obterTodos(){
        return service.obterTodos();
    }

    @GetMapping("/{id}")
    public Mono<EventoDto> obtePorId(@PathVariable Long id){
        return service.obtePorId(id);
    }

    @PostMapping()
    public Mono<EventoDto> cadastrar(@RequestBody EventoDto eventoDto){
        return service.cadastrar(eventoDto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deletar(@PathVariable Long id){
        return service.deletar(id);
    }

    @PutMapping("/{id}")
    public Mono<EventoDto> alterar(@PathVariable Long id, @RequestBody EventoDto dto){
        return service.alterar(id, dto);
    }

    @GetMapping(value = "/categoria/{tipo}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<EventoDto> obterPorTipo(@PathVariable String tipo) {
        return Flux.from(service.obterPorTipo(tipo)
                .delayElements(Duration.ofSeconds(4)));
    }



}
